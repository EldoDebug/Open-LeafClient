package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import com.google.common.base.*;
import java.util.zip.*;
import java.io.*;
import com.google.common.collect.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl extends llllIIIIlIIIlIlllIll implements Closeable
{
    public static final Splitter IlIlIlIlIlllllllllIl;
    private ZipFile llIllIIIIIllIlIIIIlI;
    
    static {
        IlIlIlIlIlllllllllIl = Splitter.on('/').omitEmptyStrings().limit(3);
    }
    
    public IllIIlllIIIIlllIIlIl(final File file) {
        super(file);
    }
    
    private ZipFile IlIIIlIlIIIllIlIlIIl() {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = new ZipFile(this.llllIIIIlIIIlIlllIll);
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected InputStream llllIIIIlIIIlIlllIll(final String s) {
        final ZipFile ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final ZipEntry entry = ilIIIlIlIIIllIlIlIIl.getEntry(s);
        if (entry == null) {
            throw new IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll, s);
        }
        return ilIIIlIlIIIllIlIlIIl.getInputStream(entry);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        try {
            return this.IlIIIlIlIIIllIlIlIIl().getEntry(s) != null;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    @Override
    public Set llIllIIIIIllIlIIIIlI() {
        ZipFile ilIIIlIlIIIllIlIlIIl;
        try {
            ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        }
        catch (IOException ex) {
            return Collections.emptySet();
        }
        final Enumeration<? extends ZipEntry> entries = ilIIIlIlIIIllIlIlIIl.entries();
        final HashSet hashSet = Sets.newHashSet();
        while (entries.hasMoreElements()) {
            final String name = ((ZipEntry)entries.nextElement()).getName();
            if (name.startsWith("assets/")) {
                final ArrayList arrayList = Lists.newArrayList(IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.split((CharSequence)name));
                if (arrayList.size() <= 1) {
                    continue;
                }
                final String s = arrayList.get(1);
                if (!s.equals(s.toLowerCase())) {
                    this.llIllIIIIIllIlIIIIlI(s);
                }
                else {
                    hashSet.add(s);
                }
            }
        }
        return hashSet;
    }
    
    @Override
    protected void finalize() {
        this.close();
        super.finalize();
    }
    
    @Override
    public void close() {
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.close();
            this.llIllIIIIIllIlIIIIlI = null;
        }
    }
}
