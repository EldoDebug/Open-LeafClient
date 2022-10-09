package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import com.google.common.collect.*;
import org.apache.commons.io.filefilter.*;
import java.io.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    public llllIIIlIlllIlIIIIIl(final File file) {
        super(file);
    }
    
    @Override
    protected InputStream llllIIIIlIIIlIlllIll(final String s) {
        return new BufferedInputStream(new FileInputStream(new File(this.llllIIIIlIIIlIlllIll, s)));
    }
    
    @Override
    protected boolean IlIlIlIlIlllllllllIl(final String s) {
        return new File(this.llllIIIIlIIIlIlllIll, s).isFile();
    }
    
    @Override
    public Set llIllIIIIIllIlIIIIlI() {
        final HashSet hashSet = Sets.newHashSet();
        final File file = new File(this.llllIIIIlIIIlIlllIll, "assets/");
        if (file.isDirectory()) {
            File[] listFiles;
            for (int length = (listFiles = file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)).length, i = 0; i < length; ++i) {
                final String llllIIIIlIIIlIlllIll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(file, listFiles[i]);
                if (!llllIIIIlIIIlIlllIll.equals(llllIIIIlIIIlIlllIll.toLowerCase())) {
                    this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
                }
                else {
                    hashSet.add(llllIIIIlIIIlIlllIll.substring(0, llllIIIIlIIIlIlllIll.length() - 1));
                }
            }
        }
        return hashSet;
    }
}
