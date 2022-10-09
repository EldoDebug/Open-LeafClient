package net.optifine.shaders;

import net.optifine.util.*;
import java.util.zip.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import com.google.common.base.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class llIIIlIlIllIIlIlIlII implements lIlIlIIIllIIllIIIllI
{
    protected File llllIIIIlIIIlIlllIll;
    protected ZipFile IlIlIlIlIlllllllllIl;
    protected String llIllIIIIIllIlIIIIlI;
    
    public llIIIlIlIllIIlIlIlII(final String s, final File llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = "";
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        if (this.IlIlIlIlIlllllllllIl != null) {
            try {
                this.IlIlIlIlIlllllllllIl.close();
            }
            catch (Exception ex) {}
            this.IlIlIlIlIlllllllllIl = null;
        }
    }
    
    @Override
    public InputStream llllIIIIlIIIlIlllIll(final String s) {
        try {
            if (this.IlIlIlIlIlllllllllIl == null) {
                this.IlIlIlIlIlllllllllIl = new ZipFile(this.llllIIIIlIIIlIlllIll);
                this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            }
            String s2 = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "/");
            if (s2.contains("..")) {
                s2 = this.llIllIIIIIllIlIIIIlI(s2);
            }
            final ZipEntry entry = this.IlIlIlIlIlllllllllIl.getEntry(String.valueOf(this.llIllIIIIIllIlIIIIlI) + s2);
            return (entry == null) ? null : this.IlIlIlIlIlllllllllIl.getInputStream(entry);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private String llIllIIIIIllIlIIIIlI(final String s) {
        final ArrayDeque<String> arrayDeque = (ArrayDeque<String>)new ArrayDeque<Object>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, "/");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (s2.equals("..")) {
                if (arrayDeque.isEmpty()) {
                    return "";
                }
                arrayDeque.removeLast();
            }
            else {
                arrayDeque.add(s2);
            }
        }
        return Joiner.on('/').join((Iterable)arrayDeque);
    }
    
    private String llllIIIIlIIIlIlllIll(final ZipFile zipFile) {
        final ZipEntry entry = zipFile.getEntry("shaders/");
        if (entry != null && entry.isDirectory()) {
            return "";
        }
        final Pattern compile = Pattern.compile("([^/]+/)shaders/");
        final Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            final Matcher matcher = compile.matcher(((ZipEntry)entries.nextElement()).getName());
            if (matcher.matches()) {
                final String group = matcher.group(1);
                if (group == null) {
                    continue;
                }
                if (group.equals("shaders/")) {
                    return "";
                }
                return group;
            }
        }
        return "";
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        try {
            if (this.IlIlIlIlIlllllllllIl == null) {
                this.IlIlIlIlIlllllllllIl = new ZipFile(this.llllIIIIlIIIlIlllIll);
                this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            }
            return this.IlIlIlIlIlllllllllIl.getEntry(String.valueOf(this.llIllIIIIIllIlIIIIlI) + IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "/")) != null;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.getName();
    }
}
