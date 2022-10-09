package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.net.*;
import java.util.*;
import javax.naming.directory.*;

public class IlIlIIIllIllIIIIIllI
{
    private final String llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    private IlIlIIIllIllIIIIIllI(final String llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return IDN.toASCII(this.llllIIIIlIIIlIlllIll);
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public static IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return null;
        }
        String[] split = s.split(":");
        if (s.startsWith("[")) {
            final int index = s.indexOf("]");
            if (index > 0) {
                final String substring = s.substring(1, index);
                final String trim = s.substring(index + 1).trim();
                if (trim.startsWith(":") && trim.length() > 0) {
                    split = new String[] { substring, trim.substring(1) };
                }
                else {
                    split = new String[] { substring };
                }
            }
        }
        if (split.length > 2) {
            split = new String[] { s };
        }
        String s2 = split[0];
        int llllIIIIlIIIlIlllIll = (split.length > 1) ? llllIIIIlIIIlIlllIll(split[1], 25565) : 25565;
        if (llllIIIIlIIIlIlllIll == 25565) {
            final String[] ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s2);
            s2 = ilIlIlIlIlllllllllIl[0];
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[1], 25565);
        }
        return new IlIlIIIllIllIIIIIllI(s2, llllIIIIlIIIlIlllIll);
    }
    
    private static String[] IlIlIlIlIlllllllllIl(final String s) {
        try {
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            final Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            final String[] split = new InitialDirContext(hashtable).getAttributes("_minecraft._tcp." + s, new String[] { "SRV" }).get("srv").get().toString().split(" ", 4);
            return new String[] { split[3], split[2] };
        }
        catch (Throwable t) {
            return new String[] { s, Integer.toString(25565) };
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        try {
            return Integer.parseInt(s.trim());
        }
        catch (Exception ex) {
            return n;
        }
    }
}
