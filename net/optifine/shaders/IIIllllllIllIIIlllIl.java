package net.optifine.shaders;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import org.apache.commons.io.*;
import java.awt.image.*;
import java.io.*;
import com.google.gson.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;

public class IIIllllllIllIIIlllIl extends llllIIIIlIIIlIlllIll
{
    private String llllIIIIlIIIlIlllIll;
    private static final lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl;
    
    static {
        IlIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl();
    }
    
    public IIIllllllIllIIIlllIl(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl();
        final InputStream liiIlllIIIllIIIllIII = llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll);
        if (liiIlllIIIllIIIllIII == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.llllIIIIlIIIlIlllIll);
        }
        try {
            final BufferedImage llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
            final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, new llllIIllllIlIlIIIIll(false, false, new ArrayList()));
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
        }
        finally {
            IOUtils.closeQuietly(liiIlllIIIllIIIllIII);
        }
        IOUtils.closeQuietly(liiIlllIIIllIIIllIII);
    }
    
    public static llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final String s, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final String string = String.valueOf(s) + ".mcmeta";
        final String s2 = "texture";
        final InputStream liiIlllIIIllIIIllIII = llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII(string);
        if (liiIlllIIIllIIIllIII != null) {
            final lIIIlllIIIllIIIllIII ilIlIlIlIlllllllllIl = IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl;
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(liiIlllIIIllIIIllIII));
            llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll3;
            try {
                final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll2 = (llllIIllllIlIlIIIIll)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(s2, new JsonParser().parse((Reader)bufferedReader).getAsJsonObject());
                if (llllIIllllIlIlIIIIll2 == null) {
                    return llllIIllllIlIlIIIIll;
                }
                llllIIllllIlIlIIIIll3 = llllIIllllIlIlIIIIll2;
            }
            catch (RuntimeException ex) {
                IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Error reading metadata: " + string);
                IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(ex.getClass().getName() + ": " + ex.getMessage());
                return llllIIllllIlIlIIIIll;
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly(liiIlllIIIllIIIllIII);
            }
            IOUtils.closeQuietly((Reader)bufferedReader);
            IOUtils.closeQuietly(liiIlllIIIllIIIllIII);
            return llllIIllllIlIlIIIIll3;
        }
        return llllIIllllIlIlIIIIll;
    }
    
    private static lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl() {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new IlIllIlIlIIIlIlIlIII(), llllIIllllIlIlIIIIll.class);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(), IlIlIIIllIllIIIIIllI.class);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new llIllIIIIIllIlIIIIlI(), IlIlIlIlIlllllllllIl.class);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.class);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(), llIllIlIIIIllIlIIllI.class);
        return liiIlllIIIllIIIllIII;
    }
}
