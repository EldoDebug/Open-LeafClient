package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import com.mojang.authlib.*;
import com.mojang.authlib.properties.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIIIllIlIllIllIIIIl implements IIlIIIIIllIlIIIlIIll
{
    private IIIllIIIlIlIIllIIIlI llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    public llIIIllIlIllIllIIIIl() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
    }
    
    public llIIIllIlIllIllIIIIl(final IIIllIIIlIlIIllIIIlI llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl... array) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : array) {
            this.IlIlIlIlIlllllllllIl.add(new IIlllIIlllIIIlIlllII(this, ilIIIlIlIIIllIlIlIIl.r(), ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), ilIIIlIlIIIllIlIlIIl.IlIIIlIIIllllIlIlIlI()));
        }
    }
    
    public llIIIllIlIllIllIIIIl(final IIIllIIIlIlIIllIIIlI llllIIIIlIIIlIlllIll, final Iterable iterable) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : iterable) {
            this.IlIlIlIlIlllllllllIl.add(new IIlllIIlllIIIlIlllII(this, ilIIIlIlIIIllIlIlIIl.r(), ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), ilIIIlIlIIIllIlIlIIl.IlIIIlIIIllllIlIlIlI()));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = (IIIllIIIlIlIIllIIIlI)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.class);
        for (int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl(), i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            GameProfile gameProfile = null;
            int n = 0;
            lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
            llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = null;
            switch (llIllIIIIIllIlIIIIlI()[this.llllIIIIlIIIlIlllIll.ordinal()]) {
                case 1: {
                    gameProfile = new GameProfile(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
                    for (int ilIIIlIlIIIllIlIlIIl2 = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl(), j = 0; j < ilIIIlIlIIIllIlIlIIl2; ++j) {
                        final String llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
                        final String llIllIIIIIllIlIIIIlI2 = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
                        if (llllllIllIllIlIllllI.readBoolean()) {
                            gameProfile.getProperties().put((Object)llIllIIIIIllIlIIIIlI, (Object)new Property(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767)));
                        }
                        else {
                            gameProfile.getProperties().put((Object)llIllIIIIIllIlIIIIlI, (Object)new Property(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2));
                        }
                    }
                    lllIllIIIllllllIllll = net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl());
                    n = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
                    if (llllllIllIllIlIllllI.readBoolean()) {
                        llIIIIIIlIllIIlIIIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
                        break;
                    }
                    break;
                }
                case 2: {
                    gameProfile = new GameProfile(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), (String)null);
                    lllIllIIIllllllIllll = net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 3: {
                    gameProfile = new GameProfile(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), (String)null);
                    n = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
                    break;
                }
                case 4: {
                    gameProfile = new GameProfile(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), (String)null);
                    if (llllllIllIllIlIllllI.readBoolean()) {
                        llIIIIIIlIllIIlIIIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
                        break;
                    }
                    break;
                }
                case 5: {
                    gameProfile = new GameProfile(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), (String)null);
                    break;
                }
            }
            this.IlIlIlIlIlllllllllIl.add(new IIlllIIlllIIIlIlllII(this, gameProfile, n, lllIllIIIllllllIllll, llIIIIIIlIllIIlIIIll));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.size());
        for (final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII : this.IlIlIlIlIlllllllllIl) {
            switch (llIllIIIIIllIlIIIIlI()[this.llllIIIIlIIIlIlllIll.ordinal()]) {
                case 1: {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getName());
                    llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getProperties().size());
                    for (final Property property : illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getProperties().values()) {
                        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(property.getName());
                        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(property.getValue());
                        if (property.hasSignature()) {
                            llllllIllIllIlIllllI.writeBoolean(true);
                            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(property.getSignature());
                        }
                        else {
                            llllllIllIllIlIllllI.writeBoolean(false);
                        }
                    }
                    llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll());
                    llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl());
                    if (illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl() == null) {
                        llllllIllIllIlIllllI.writeBoolean(false);
                        continue;
                    }
                    llllllIllIllIlIllllI.writeBoolean(true);
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl());
                    continue;
                }
                case 4: {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                    if (illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl() == null) {
                        llllllIllIllIlIllllI.writeBoolean(false);
                        continue;
                    }
                    llllllIllIllIlIllllI.writeBoolean(true);
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl());
                    continue;
                }
                default: {
                    continue;
                }
                case 2: {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                    llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll());
                    continue;
                }
                case 3: {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                    llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl());
                    continue;
                }
                case 5: {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                    continue;
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public List llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IIIllIIIlIlIIllIIIlI IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("action", (Object)this.llllIIIIlIIIlIlllIll).add("entries", (Object)this.IlIlIlIlIlllllllllIl).toString();
    }
    
    static /* synthetic */ int[] llIllIIIIIllIlIIIIlI() {
        final int[] llIllIIIIIllIlIIIIlI = llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[IIIllIIIlIlIIllIIIlI.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIIIIIllIlIIIIlI2[IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
