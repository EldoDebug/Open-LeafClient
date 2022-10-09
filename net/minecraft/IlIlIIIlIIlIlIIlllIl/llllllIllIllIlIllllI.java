package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import com.mojang.authlib.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import com.mojang.authlib.properties.*;
import com.google.common.collect.*;

public class llllllIllIllIlIllllI extends IlIIIlIlIIIllIlIlIIl
{
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private GameProfile llllIIIlIlllIlIIIIIl;
    
    public llllllIllIllIlIllllI() {
        this.llllIIIlIlllIlIIIIIl = null;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SkullType", (byte)(this.IlIlIIIllIllIIIIIllI & 0xFF));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Rot", (byte)(this.IllIIlllIIIIlllIIlIl & 0xFF));
        if (this.llllIIIlIlllIlIIIIIl != null) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2, this.llllIIIlIlllIlIIIIIl);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Owner", iiiIlllIIIIIIlIIIlll2);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("SkullType");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Rot");
        if (this.IlIlIIIllIllIIIIIllI == 3) {
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Owner", 10)) {
                this.llllIIIlIlllIlIIIIIl = IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Owner"));
            }
            else if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ExtraType", 8)) {
                final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("ExtraType");
                if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl)) {
                    this.llllIIIlIlllIlIIIIIl = new GameProfile((UUID)null, llIIlIIIlIIIllIlIIIl);
                    this.IlIIIlIlIIIllIlIlIIl();
                }
            }
        }
    }
    
    public GameProfile llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        return new IllIIlllllIIllIIllIl(this.IlIlIlIlIlllllllllIl, 4, iiiIlllIIIIIIlIIIlll);
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = null;
    }
    
    public void llllIIIIlIIIlIlllIll(final GameProfile llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = 3;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIlIlllIlIIIIIl = IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl);
        this.llIIIlIlIllIIlIlIlII();
    }
    
    public static GameProfile IlIlIlIlIlllllllllIl(final GameProfile gameProfile) {
        if (gameProfile == null || lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(gameProfile.getName())) {
            return gameProfile;
        }
        if (gameProfile.isComplete() && gameProfile.getProperties().containsKey((Object)"textures")) {
            return gameProfile;
        }
        if (llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() == null) {
            return gameProfile;
        }
        GameProfile gameProfile2 = llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(gameProfile.getName());
        if (gameProfile2 == null) {
            return gameProfile;
        }
        if (Iterables.getFirst((Iterable)gameProfile2.getProperties().get((Object)"textures"), (Object)null) == null) {
            gameProfile2 = llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lllllIIIIIlIIlllIlIl().fillProfileProperties(gameProfile2, true);
        }
        return gameProfile2;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
