package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IlIllIlIlIIIlIlIlIII extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private static final lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl;
    public static IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final IIllllIIIlIIIIIIllIl lIIIIlIIIIIlllIllIII;
    private final IIllllIIIlIIIIIIllIl lIIIlllIIIllIIIllIII;
    private static volatile /* synthetic */ int[] llIIlIIIlIIIllIlIIIl;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new lIllllIllIllIIllllll("textures/entity/skeleton/skeleton.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/skeleton/wither_skeleton.png");
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/entity/zombie/zombie.png");
        llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll("textures/entity/creeper/creeper.png");
    }
    
    public IlIllIlIlIIIlIlIlIII() {
        this.lIIIIlIIIIIlllIllIII = new IIllllIIIlIIIIIIllIl(0, 0, 64, 32);
        this.lIIIlllIIIllIIIllIII = new IlIlIIIlIIlIlIIlllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final double n, final double n2, final double n3, final float n4, final int n5) {
        this.llllIIIIlIIIlIlllIll((float)n, (float)n2, (float)n3, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIIlIIIlIIIllIlIIIl() & 0x7), llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI() * 360 / 16.0f, llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(), llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(), n5);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll = this;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, float n4, final int n5, final GameProfile gameProfile, final int n6) {
        IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = this.lIIIIlIIIIIlllIllIII;
        if (n6 >= 0) {
            this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl[n6]);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 2.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, 0.0625f, 0.0625f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
        else {
            switch (n5) {
                default: {
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 1: {
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI);
                    break;
                }
                case 2: {
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl);
                    illllIIIlIIIIIIllIl = this.lIIIlllIIIllIIIllIII;
                    break;
                }
                case 3: {
                    illllIIIlIIIIIIllIl = this.lIIIlllIIIllIIIllIII;
                    lIllllIllIllIIllllll lIllllIllIllIIllllll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
                    if (gameProfile != null) {
                        final Minecraft minecraft = Minecraft.getMinecraft();
                        final Map llllIIIIlIIIlIlllIll = minecraft.llIIIIIIlIllIIlIIIll().llllIIIIlIIIlIlllIll(gameProfile);
                        if (llllIIIIlIIIlIlllIll.containsKey(MinecraftProfileTexture$Type.SKIN)) {
                            lIllllIllIllIIllllll = minecraft.llIIIIIIlIllIIlIIIll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN);
                        }
                        else {
                            lIllllIllIllIIllllll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(gameProfile));
                        }
                    }
                    this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                    break;
                }
                case 4: {
                    this.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl);
                    break;
                }
            }
        }
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            switch (IlIlIlIlIlllllllllIl()[lllIllIIIllllllIllll.ordinal()]) {
                case 3: {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + 0.5f, n2 + 0.25f, n3 + 0.74f);
                    break;
                }
                case 4: {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + 0.5f, n2 + 0.25f, n3 + 0.26f);
                    n4 = 180.0f;
                    break;
                }
                case 5: {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + 0.74f, n2 + 0.25f, n3 + 0.5f);
                    n4 = 270.0f;
                    break;
                }
                default: {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + 0.26f, n2 + 0.25f, n3 + 0.5f);
                    n4 = 90.0f;
                    break;
                }
            }
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n + 0.5f, n2, n3 + 0.5f);
        }
        final float n7 = 0.0625f;
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(null, 0.0f, 0.0f, 0.0f, n4, 0.0f, n7);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (n6 >= 0) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] llIIlIIIlIIIllIlIIIl = IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl;
        if (llIIlIIIlIIIllIlIIIl != null) {
            return llIIlIIIlIIIllIlIIIl;
        }
        final int[] llIIlIIIlIIIllIlIIIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIIlIIIlIIIllIlIIIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl2;
    }
}
