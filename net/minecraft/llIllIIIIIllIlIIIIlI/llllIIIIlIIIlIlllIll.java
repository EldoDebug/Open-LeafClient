package net.minecraft.llIllIIIIIllIlIIIIlI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.util.concurrent.*;
import org.apache.commons.lang3.*;
import org.apache.commons.io.*;
import net.optifine.*;
import java.text.*;
import java.util.*;
import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final Throwable llIllIIIIIllIlIIIIlI;
    private final lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private File IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private StackTraceElement[] lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllIIIIlIIIlIlllIll(final String ilIlIlIlIlllllllllIl, final Throwable llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = new lIIIlllIIIllIIIllIII(this, "System Details");
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIIlIIIIIlllIllIII = new StackTraceElement[0];
        this.lIIIlllIIIllIIIllIII = false;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl();
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("Minecraft Version", new IlIlIlIlIlllllllllIl(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("Operating System", new llIllIIIIIllIlIIIIlI(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("Java Version", new IlIIIlIlIIIllIlIlIIl(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("Java VM Version", new IlIlIIIllIllIIIIIllI(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("Memory", new IllIIlllIIIIlllIIlIl(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("JVM Flags", new llllIIIlIlllIlIIIIIl(this));
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("IntCache", new lIIIIlIIIIIlllIllIII(this));
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll, new Object[0]), net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl, this, this.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public Throwable IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final StringBuilder sb) {
        if ((this.lIIIIlIIIIIlllIllIII == null || this.lIIIIlIIIIIlllIllIII.length <= 0) && this.IlIlIIIllIllIIIIIllI.size() > 0) {
            this.lIIIIlIIIIIlllIllIII = (StackTraceElement[])ArrayUtils.subarray((Object[])this.IlIlIIIllIllIIIIIllI.get(0).llllIIIIlIIIlIlllIll(), 0, 1);
        }
        if (this.lIIIIlIIIIIlllIllIII != null && this.lIIIIlIIIIIlllIllIII.length > 0) {
            sb.append("-- Head --\n");
            sb.append("Stacktrace:\n");
            StackTraceElement[] liiiIlIIIIIlllIllIII;
            for (int length = (liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII).length, i = 0; i < length; ++i) {
                sb.append("\t").append("at ").append(liiiIlIIIIIlllIllIII[i].toString());
                sb.append("\n");
            }
            sb.append("\n");
        }
        final Iterator<lIIIlllIIIllIIIllIII> iterator = (Iterator<lIIIlllIIIllIIIllIII>)this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(sb);
            sb.append("\n\n");
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(sb);
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI.getMessage() == null) {
            if (llIllIIIIIllIlIIIIlI instanceof NullPointerException) {
                llIllIIIIIllIlIIIIlI = new NullPointerException(this.IlIlIlIlIlllllllllIl);
            }
            else if (llIllIIIIIllIlIIIIlI instanceof StackOverflowError) {
                llIllIIIIIllIlIIIIlI = new StackOverflowError(this.IlIlIlIlIlllllllllIl);
            }
            else if (llIllIIIIIllIlIIIIlI instanceof OutOfMemoryError) {
                llIllIIIIIllIlIIIIlI = new OutOfMemoryError(this.IlIlIlIlIlllllllllIl);
            }
            llIllIIIIIllIlIIIIlI.setStackTrace(this.llIllIIIIIllIlIIIIlI.getStackTrace());
        }
        String s = llIllIIIIIllIlIIIIlI.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            llIllIIIIIllIlIIIIlI.printStackTrace(printWriter);
            s = stringWriter.toString();
        }
        finally {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly((Writer)printWriter);
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return s;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        if (!this.lIIIlllIIIllIIIllIII) {
            this.lIIIlllIIIllIIIllIII = true;
            IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this, this.IlIIIlIlIIIllIlIlIIl);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("---- Minecraft Crash Report ----\n");
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, sb);
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl, sb);
        sb.append("// ");
        sb.append(lIIIIlIIIIIlllIllIII());
        sb.append("\n\n");
        sb.append("Time: ");
        sb.append(new SimpleDateFormat().format(new Date()));
        sb.append("\n");
        sb.append("Description: ");
        sb.append(this.IlIlIlIlIlllllllllIl);
        sb.append("\n\n");
        sb.append(this.llIllIIIIIllIlIIIIlI());
        sb.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            sb.append("-");
        }
        sb.append("\n\n");
        this.llllIIIIlIIIlIlllIll(sb);
        return sb.toString();
    }
    
    public File IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final File illIIlllIIIIlllIIlIl) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            return false;
        }
        if (illIIlllIIIIlllIIlIl.getParentFile() != null) {
            illIIlllIIIIlllIIlIl.getParentFile().mkdirs();
        }
        try {
            final FileWriter fileWriter = new FileWriter(illIIlllIIIIlllIIlIl);
            fileWriter.write(this.IlIIIlIlIIIllIlIlIIl());
            fileWriter.close();
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            return true;
        }
        catch (Throwable t) {
            net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Could not save crash report to " + illIIlllIIIIlllIIlIl, t);
            return false;
        }
    }
    
    public lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, 1);
    }
    
    public lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s, final int n) {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(this, s);
        if (this.llllIIIlIlllIlIIIIIl) {
            final int llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n);
            final StackTraceElement[] stackTrace = this.llIllIIIIIllIlIIIIlI.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            final int n2 = stackTrace.length - llllIIIIlIIIlIlllIll;
            if (n2 < 0) {
                System.out.println("Negative index in crash report handler (" + stackTrace.length + "/" + llllIIIIlIIIlIlllIll + ")");
            }
            if (stackTrace != null && n2 >= 0 && n2 < stackTrace.length) {
                stackTraceElement = stackTrace[n2];
                if (stackTrace.length + 1 - llllIIIIlIIIlIlllIll < stackTrace.length) {
                    stackTraceElement2 = stackTrace[stackTrace.length + 1 - llllIIIIlIIIlIlllIll];
                }
            }
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(stackTraceElement, stackTraceElement2);
            if (llllIIIIlIIIlIlllIll > 0 && !this.IlIlIIIllIllIIIIIllI.isEmpty()) {
                this.IlIlIIIllIllIIIIIllI.get(this.IlIlIIIllIllIIIIIllI.size() - 1).IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            }
            else if (stackTrace != null && stackTrace.length >= llllIIIIlIIIlIlllIll && n2 >= 0 && n2 < stackTrace.length) {
                System.arraycopy(stackTrace, 0, this.lIIIIlIIIIIlllIllIII = new StackTraceElement[n2], 0, this.lIIIIlIIIIIlllIllIII.length);
            }
            else {
                this.llllIIIlIlllIlIIIIIl = false;
            }
        }
        this.IlIlIIIllIllIIIIIllI.add(liiIlllIIIllIIIllIII);
        return liiIlllIIIllIIIllIII;
    }
    
    private static String lIIIIlIIIIIlllIllIII() {
        final String[] array = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
        try {
            return array[(int)(System.nanoTime() % array.length)];
        }
        catch (Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Throwable t, final String s) {
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
        if (t instanceof IIlIlllIlIlllIlIllll) {
            llllIIIIlIIIlIlllIll = ((IIlIlllIlIlllIlIllll)t).llllIIIIlIIIlIlllIll();
        }
        else {
            llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(s, t);
        }
        return llllIIIIlIIIlIlllIll;
    }
}
