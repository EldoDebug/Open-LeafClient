package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.logging.log4j.*;
import java.util.concurrent.*;

public class c
{
    public static d llllIIIIlIIIlIlllIll() {
        final String lowerCase = System.getProperty("os.name").toLowerCase();
        return lowerCase.contains("win") ? d.llIllIIIIIllIlIIIIlI : (lowerCase.contains("mac") ? d.IlIIIlIlIIIllIlIlIIl : (lowerCase.contains("solaris") ? d.IlIlIlIlIlllllllllIl : (lowerCase.contains("sunos") ? d.IlIlIlIlIlllllllllIl : (lowerCase.contains("linux") ? d.llllIIIIlIIIlIlllIll : (lowerCase.contains("unix") ? d.llllIIIIlIIIlIlllIll : d.IlIlIIIllIllIIIIIllI)))));
    }
    
    public static Object llllIIIIlIIIlIlllIll(final FutureTask futureTask, final Logger logger) {
        try {
            futureTask.run();
            return futureTask.get();
        }
        catch (ExecutionException ex) {
            logger.fatal("Error executing task", (Throwable)ex);
            if (ex.getCause() instanceof OutOfMemoryError) {
                throw (OutOfMemoryError)ex.getCause();
            }
        }
        catch (InterruptedException ex2) {
            logger.fatal("Error executing task", (Throwable)ex2);
        }
        return null;
    }
}
