package net.optifine.shaders;

import net.optifine.util.*;
import java.io.*;

public class IlIlIllllllllIIIIlII implements lIlIlIIIllIIllIIIllI
{
    protected File llllIIIIlIIIlIlllIll;
    
    public IlIlIllllllllIIIIlII(final String s, final File llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    public InputStream llllIIIIlIIIlIlllIll(final String s) {
        try {
            final File file = new File(this.llllIIIIlIIIlIlllIll, IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s, "/", "/"));
            InputStream inputStream;
            if (!file.exists()) {
                inputStream = null;
            }
            else {
                final FileInputStream fileInputStream;
                inputStream = new BufferedInputStream(fileInputStream);
                fileInputStream = new FileInputStream(file);
            }
            return inputStream;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        final File file = new File(this.llllIIIIlIIIlIlllIll, s.substring(1));
        return file.exists() && file.isDirectory();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.getName();
    }
}
