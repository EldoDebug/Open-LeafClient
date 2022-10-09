package net.minecraft.client.IIIIlllIIIIIIlIIIlll;

import java.util.*;
import com.google.common.collect.*;
import java.io.*;

public class IlIlIlIlIlllllllllIl extends IOException
{
    private final List llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    public IlIlIlIlIlllllllllIl(final String ilIlIlIlIlllllllllIl) {
        (this.llllIIIIlIIIlIlllIll = Lists.newArrayList()).add(new llIllIIIIIllIlIIIIlI(null));
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IlIlIlIlIlllllllllIl(final String ilIlIlIlIlllllllllIl, final Throwable t) {
        super(t);
        (this.llllIIIIlIIIlIlllIll = Lists.newArrayList()).add(new llIllIIIIIllIlIIIIlI(null));
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.llllIIIIlIIIlIlllIll.get(0).llllIIIIlIIIlIlllIll(s);
    }
    
    public void IlIlIlIlIlllllllllIl(final String s) {
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.get(0), s);
        this.llllIIIIlIIIlIlllIll.add(0, new llIllIIIIIllIlIIIIlI(null));
    }
    
    @Override
    public String getMessage() {
        return "Invalid " + this.llllIIIIlIIIlIlllIll.get(this.llllIIIIlIIIlIlllIll.size() - 1).toString() + ": " + this.IlIlIlIlIlllllllllIl;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final Exception ex) {
        if (ex instanceof IlIlIlIlIlllllllllIl) {
            return (IlIlIlIlIlllllllllIl)ex;
        }
        String message = ex.getMessage();
        if (ex instanceof FileNotFoundException) {
            message = "File not found";
        }
        return new IlIlIlIlIlllllllllIl(message, ex);
    }
}
