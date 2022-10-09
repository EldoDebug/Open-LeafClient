package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI
{
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("xPos"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("zPos"));
        illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("Blocks");
        illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl = new lIIIlllIIIllIIIllIII(iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("Data"), 7);
        illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = new lIIIlllIIIllIIIllIII(iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("SkyLight"), 7);
        illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = new lIIIlllIIIllIIIllIII(iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("BlockLight"), 7);
        illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("HeightMap");
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("TerrainPopulated");
        illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Entities", 10);
        illIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("TileEntities", 10);
        illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("TileTicks", 10);
        try {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("LastUpdate");
        }
        catch (ClassCastException ex) {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("LastUpdate");
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xPos", illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zPos", illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LastUpdate", illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        final int[] array = new int[illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.length];
        for (int i = 0; i < illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.length; ++i) {
            array[i] = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI[i];
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HeightMap", array);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TerrainPopulated", illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int j = 0; j < 8; ++j) {
            boolean b = true;
            for (int n = 0; n < 16 && b; ++n) {
                for (int n2 = 0; n2 < 16 && b; ++n2) {
                    for (int k = 0; k < 16; ++k) {
                        if (illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl[n << 11 | k << 7 | n2 + (j << 4)] != 0) {
                            b = false;
                            break;
                        }
                    }
                }
            }
            if (!b) {
                final byte[] array2 = new byte[4096];
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII3 = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
                for (int l = 0; l < 16; ++l) {
                    for (int n3 = 0; n3 < 16; ++n3) {
                        for (int n4 = 0; n4 < 16; ++n4) {
                            array2[n3 << 8 | n4 << 4 | l] = (byte)(illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl[l << 11 | n4 << 7 | n3 + (j << 4)] & 0xFF);
                            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(l, n3, n4, illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(l, n3 + (j << 4), n4));
                            liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll(l, n3, n4, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(l, n3 + (j << 4), n4));
                            liiIlllIIIllIIIllIII3.llllIIIIlIIIlIlllIll(l, n3, n4, illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(l, n3 + (j << 4), n4));
                        }
                    }
                }
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Y", (byte)(j & 0xFF));
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Blocks", array2);
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Data", liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("SkyLight", liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll());
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("BlockLight", liiIlllIIIllIIIllIII3.llllIIIIlIIIlIlllIll());
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Sections", ilIlIIIlIIlIlIIlllIl);
        final byte[] array3 = new byte[256];
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int n5 = 0; n5 < 16; ++n5) {
            for (int n6 = 0; n6 < 16; ++n6) {
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI << 4 | n5, 0, illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI << 4 | n6);
                array3[n6 << 4 | n5] = (byte)(iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl).lIIIIIlIlIIIlIIIIlIl & 0xFF);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Biomes", array3);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Entities", illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileEntities", illIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII);
        if (illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileTicks", illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl);
        }
    }
}
