package controllers;

import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }
    
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
    
    // Access rights
    
    public static boolean isOwnerOfSound(Long soundProjectId) {
        return SoundProject.isOwner(
        		soundProjectId,
            Context.current().request().username()
        );
    }
    
    // Access rights
    
    public static boolean isOwnerOfJobOffer(Long jobId) {
        return JobOffer.isOwner(
        		jobId,
            Context.current().request().username()
        );
    }
    
}