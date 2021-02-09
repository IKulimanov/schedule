package ru.rsatu.university;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.jboss.logging.Logger;
import ru.rsatu.university.Entity.Predmet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/schedule")
public class Schedule {

    private static final Logger LOG = Logger.getLogger(Schedule.class);

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    @Timed(name = "Timed", unit = MetricUnits.MILLISECONDS)
    @Counted(unit = MetricUnits.NONE,
            name = "test",
            absolute = true,
            displayName = "hello",
            description = "Monitor how many times hello method was called")
    public String getPredmet(){
        LOG.info("start metod hello");
        return "test";
    }

    @GET
    @Path("/getPair")
    @Produces(MediaType.TEXT_PLAIN)
    @Timed(name = "Timed", unit = MetricUnits.MILLISECONDS)
    @Counted(unit = MetricUnits.NONE,
            name = "test",
            absolute = true,
            displayName = "hello",
            description = "Monitor how many times hello method was called")
    public String getPair(){
        LOG.info("start metod hello");
        return "test";
    }



}
