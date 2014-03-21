package com.abhirockzz.blog.oimagination;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



//RESTFul facade/gateway for exposing user management operations


@Path("/rest/oim/userOps")

public class UserOpsRESTFacade {
    
    //leverage existing EJB containing business implementation for user operations
    
    @Inject
    private UserManagementImpl userOpsBizImpl;
    
    //expose functionality via simple methods/contracts
    //enable JSON and XML as data format
    
    @Path("create")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    
    public void createUser(){
        
        userOpsBizImpl.create();
    }
    
    @Path("update")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    
    public void updateUser(){
        
        userOpsBizImpl.update();
    }
    
    @Path("search")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    
    public void search(){
        
        userOpsBizImpl.lookup();
    }
    
    @Path("delete")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    
    public void deleteUser(){
        
        userOpsBizImpl.delete();
    }
}
