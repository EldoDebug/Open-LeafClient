package net.minecraft.IlIllIlIlIIIlIlIlIII;

import com.google.common.collect.*;
import java.net.*;
import java.lang.management.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private final Map llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final URL IlIIIlIlIIIllIlIlIIl;
    private final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    private final Timer IllIIlllIIIIlllIIlIl;
    private final Object llllIIIlIlllIlIIIIIl;
    private final long lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    
    public IlIlIlIlIlllllllllIl(final String s, final llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI, final long liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = UUID.randomUUID().toString();
        this.IllIIlllIIIIlllIIlIl = new Timer("Snooper Timer", true);
        this.llllIIIlIlllIlIIIIIl = new Object();
        try {
            this.IlIIIlIlIIIllIlIlIIl = new URL("http://snoop.minecraft.net/" + s + "?version=" + 2);
        }
        catch (MalformedURLException ex) {
            throw new IllegalArgumentException();
        }
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (!this.lIIIlllIIIllIIIllIII) {
            this.lIIIlllIIIllIIIllIII = true;
            this.lIIIIlIIIIIlllIllIII();
            this.IllIIlllIIIIlllIIlIl.schedule(new llIllIIIIIllIlIIIIlI(this), 0L, 900000L);
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        this.lIIIlllIIIllIIIllIII();
        this.llllIIIIlIIIlIlllIll("snooper_token", this.llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl("snooper_token", this.llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl("os_name", System.getProperty("os.name"));
        this.IlIlIlIlIlllllllllIl("os_version", System.getProperty("os.version"));
        this.IlIlIlIlIlllllllllIl("os_architecture", System.getProperty("os.arch"));
        this.IlIlIlIlIlllllllllIl("java_version", System.getProperty("java.version"));
        this.llllIIIIlIIIlIlllIll("version", "1.8.9");
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this);
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        int n = 0;
        for (final String s : inputArguments) {
            if (s.startsWith("-X")) {
                this.llllIIIIlIIIlIlllIll("jvm_arg[" + n++ + "]", s);
            }
        }
        this.llllIIIIlIIIlIlllIll("jvm_args", n);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl("memory_total", Runtime.getRuntime().totalMemory());
        this.IlIlIlIlIlllllllllIl("memory_max", Runtime.getRuntime().maxMemory());
        this.IlIlIlIlIlllllllllIl("memory_free", Runtime.getRuntime().freeMemory());
        this.IlIlIlIlIlllllllllIl("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final Object o) {
        synchronized (this.llllIIIlIlllIlIIIIIl) {
            this.IlIlIlIlIlllllllllIl.put(s, o);
        }
        // monitorexit(this.llllIIIlIlllIlIIIIIl)
    }
    
    public void IlIlIlIlIlllllllllIl(final String s, final Object o) {
        synchronized (this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll.put(s, o);
        }
        // monitorexit(this.llllIIIlIlllIlIIIIIl)
    }
    
    public Map llIllIIIIIllIlIIIIlI() {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        synchronized (this.llllIIIlIlllIlIIIIIl) {
            this.IlIlIlIlIlllllllllIl();
            for (final Map.Entry<String, V> entry : this.llllIIIIlIIIlIlllIll.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (final Map.Entry<String, V> entry2 : this.IlIlIlIlIlllllllllIl.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
            // monitorexit(this.llllIIIlIlllIlIIIIIl)
            return (LinkedHashMap<String, String>)linkedHashMap;
        }
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IllIIlllIIIIlllIIlIl.cancel();
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public long llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
