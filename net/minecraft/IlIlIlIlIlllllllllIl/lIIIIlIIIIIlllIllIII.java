package net.minecraft.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import java.text.*;
import java.io.*;
import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "debug";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.debug.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.debug.usage", new Object[0]);
        }
        if (array[0].equals("start")) {
            if (array.length != 1) {
                throw new llllIllllIllllIlIlII("commands.debug.usage", new Object[0]);
            }
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.debug.start", new Object[0]);
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlIlIllllIlllIIIIll();
            this.IlIlIlIlIlllllllllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
            this.llIllIIIIIllIlIIIIlI = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIllllIllllIlIlII();
        }
        else {
            if (!array[0].equals("stop")) {
                throw new llllIllllIllllIlIlII("commands.debug.usage", new Object[0]);
            }
            if (array.length != 1) {
                throw new llllIllllIllllIlIlII("commands.debug.usage", new Object[0]);
            }
            if (!net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
                throw new IIIIlllIIIIIIlIIIlll("commands.debug.notStarted", new Object[0]);
            }
            final long lllllIIllIlIllIllllI = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
            final int llllIllllIllllIlIlII = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIllllIllllIlIlII();
            final long n = lllllIIllIlIllIllllI - this.IlIlIlIlIlllllllllIl;
            final int n2 = llllIllllIllllIlIlII - this.llIllIIIIIllIlIIIIlI;
            this.llllIIIIlIIIlIlllIll(n, n2);
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = false;
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.debug.stop", n / 1000.0f, n2);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final long n, final int n2) {
        final File file = new File(net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            final FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.IlIlIlIlIlllllllllIl(n, n2));
            fileWriter.close();
        }
        catch (Throwable t) {
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.error("Could not save profiler results to " + file, t);
        }
    }
    
    private String IlIlIlIlIlllllllllIl(final long n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("---- Minecraft Profiler Results ----\n");
        sb.append("// ");
        sb.append(IlIIIlIlIIIllIlIlIIl());
        sb.append("\n\n");
        sb.append("Time span: ").append(n).append(" ms\n");
        sb.append("Tick span: ").append(n2).append(" ticks\n");
        sb.append("// This is approximately ").append(String.format("%.2f", n2 / (n / 1000.0f))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        sb.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.llllIIIIlIIIlIlllIll(0, "root", sb);
        sb.append("--- END PROFILE DUMP ---\n\n");
        return sb.toString();
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final String s, final StringBuilder sb) {
        final List ilIlIlIlIlllllllllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.size() >= 3) {
            for (int i = 1; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.get(i);
                sb.append(String.format("[%02d] ", n));
                for (int j = 0; j < n; ++j) {
                    sb.append(" ");
                }
                sb.append(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI).append(" - ").append(String.format("%.2f", ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)).append("%/").append(String.format("%.2f", ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl)).append("%\n");
                if (!ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.equals("unspecified")) {
                    try {
                        this.llllIIIIlIIIlIlllIll(n + 1, String.valueOf(s) + "." + ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, sb);
                    }
                    catch (Exception ex) {
                        sb.append("[[ EXCEPTION ").append(ex).append(" ]]");
                    }
                }
            }
        }
    }
    
    private static String IlIIIlIlIIIllIlIlIIl() {
        final String[] array = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
        try {
            return array[(int)(System.nanoTime() % array.length)];
        }
        catch (Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "start", "stop") : null;
    }
}
