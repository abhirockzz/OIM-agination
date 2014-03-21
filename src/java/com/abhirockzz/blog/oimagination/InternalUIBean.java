package com.abhirockzz.blog.oimagination;


import javax.inject.Inject;

//Internal layer of the application 


public class InternalUIBean {
    
    //leveraging the already exising EJB via simple Dependency Injection
    
    @Inject
    private OIMBizLocal bizImpl;
    
    public void someUIOp(){
        
        bizImpl.localOp();
    }
    
}
