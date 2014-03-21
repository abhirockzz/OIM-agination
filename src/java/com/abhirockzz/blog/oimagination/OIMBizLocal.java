package com.abhirockzz.blog.oimagination;



//Local interface for use within internal clients within the container
//e.g. UI interface

public interface OIMBizLocal {
    
     public void localOp();
     
     public void processEvent(BusinessEvent event);
}
