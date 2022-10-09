package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import java.awt.image.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class llIllIIIIIllIlIIIIlI implements llllIIllllIlIlIIIIll
{
    public static final Set llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = (Set)ImmutableSet.of((Object)"minecraft", (Object)"realms");
    }
    
    public llIllIIIIIllIlIIIIlI(final Map ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public InputStream llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final InputStream ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll);
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final InputStream llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        throw new FileNotFoundException(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
    }
    
    public InputStream llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final File file = this.IlIlIlIlIlllllllllIl.get(lIllllIllIllIIllllll.toString());
        return (file != null && file.isFile()) ? new FileInputStream(file) : null;
    }
    
    private InputStream IlIIIlIlIIIllIlIlIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final String string = "/assets/" + lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI() + "/" + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final InputStream llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(string);
        return (llllIIIIlIIIlIlllIll != null) ? llllIIIIlIIIlIlllIll : llIllIIIIIllIlIIIIlI.class.getResourceAsStream(string);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll) != null || this.IlIlIlIlIlllllllllIl.containsKey(lIllllIllIllIIllllll.toString());
    }
    
    @Override
    public Set llIllIIIIIllIlIIIIlI() {
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final String s) {
        try {
            return net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, new FileInputStream(this.IlIlIlIlIlllllllllIl.get("pack.mcmeta")), s);
        }
        catch (RuntimeException ex) {
            return null;
        }
        catch (FileNotFoundException ex2) {
            return null;
        }
    }
    
    @Override
    public BufferedImage llllIIIIlIIIlIlllIll() {
        return IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.class.getResourceAsStream("/" + new lIllllIllIllIIllllll("pack.png").IlIlIlIlIlllllllllIl()));
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl() {
        return "Default";
    }
}
