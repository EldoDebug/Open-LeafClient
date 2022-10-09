package net.optifine.llllIIIlIlllIlIIIIIl;

import net.optifine.IlIIIlIlIIIllIlIlIIl.*;
import com.google.gson.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IllIIlllIIIIlllIIlIl implements IlIlIIIllIIllIlllllI
{
    private String llllIIIIlIIIlIlllIll;
    
    public IllIIlllIIIIlllIIlIl(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final byte[] array, final Throwable t) {
        if (array != null) {
            try {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = new IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(new JsonParser().parse(new String(array, "ASCII")));
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(true);
                    llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll);
                }
            }
            catch (Exception ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Error parsing configuration: " + s + ", " + ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
    }
}
