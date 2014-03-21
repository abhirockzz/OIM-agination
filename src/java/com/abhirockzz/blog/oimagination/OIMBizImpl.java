package com.abhirockzz.blog.oimagination;


//Actual implementation of the interface


import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.interceptor.Interceptors;

@Stateless

//specifying the Remote interface
@Remote(OIMBizRemote.class)

//specifying the Local interface
@Local(OIMBizLocal.class)

//Its leveraging the Audit interceptor to ensure that Auditing is seamlessly applicalble for all its methods

@Interceptors(AuditInterceptor.class)

public class OIMBizImpl implements OIMBizLocal, OIMBizRemote{

    @Override
    public void remoteOp() {
        //business logic
    }

    @Override
    public void localOp() {
        //business logic
    }
    
    //the @Obeserver annotation is all you need to specify this method as a 'listener' for
    //BusinessEvent objects

    @Override
    public void processEvent(@Observes BusinessEvent event) {
        
        //leverage the event object to perform concrete actions
        
       String eventData = event.fetchData();
    }
    
}
