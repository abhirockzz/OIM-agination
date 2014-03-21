package com.abhirockzz.blog.oimagination;


//This Interceptor can be applied generically to any method in an EJB

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class AuditInterceptor {
    
    //Leverages an existing EJB and its business logic for performing audit related operations
    
    @Inject
    private AuditBiz auditOps;
    
    public void audit(InvocationContext context){
        
        
        try {
            auditOps.performAudit();
            context.proceed();
        } catch (Exception ex) {
            Logger.getLogger(AuditInterceptor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
