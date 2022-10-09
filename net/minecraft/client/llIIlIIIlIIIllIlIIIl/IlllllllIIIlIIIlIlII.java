package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.io.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.gson.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlllllllIIIlIIIlIlII extends IIIlIIIlIlIIlllIIlll
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    private final llllIIllllIlIlIIIIll IlIIIlIlIIIllIlIlIIl;
    private final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
    }
    
    public IlllllllIIIlIIIlIlII(final IIIIIIIllllIlIIIIIII iiiiiiIllllIlIIIIIII) {
        super(iiiiiiIllllIlIIIIIII);
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll;
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
        try {
            llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll());
        }
        catch (IOException ex) {
            llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll;
        }
        this.IlIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll("texturepackicon", llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return 1;
    }
    
    @Override
    protected String IlIlIlIlIlllllllllIl() {
        try {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (IlIlIIIllIIllIlllllI)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl().IlIlIlIlIlllllllllIl, "pack");
            if (ilIlIIIllIIllIlllllI != null) {
                return ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII();
            }
        }
        catch (JsonParseException ex) {
            IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI.error("Couldn't load metadata info", (Throwable)ex);
        }
        catch (IOException ex2) {
            IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI.error("Couldn't load metadata info", (Throwable)ex2);
        }
        return IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Missing " + "pack.mcmeta" + " :(";
    }
    
    @Override
    protected boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
    
    @Override
    protected boolean llllIIIlIlllIlIIIIIl() {
        return false;
    }
    
    @Override
    protected boolean lIIIIlIIIIIlllIllIII() {
        return false;
    }
    
    @Override
    protected boolean lIIIlllIIIllIIIllIII() {
        return false;
    }
    
    @Override
    protected String llIllIIIIIllIlIIIIlI() {
        return "Default";
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    protected boolean IlIlIIIllIllIIIIIllI() {
        return false;
    }
}
