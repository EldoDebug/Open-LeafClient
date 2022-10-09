package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IllllIIlIlIllIIIllII implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("EMPTY", 0, "empty"), 
    IlIlIlIlIlllllllllIl("POPPY", 1, "rose"), 
    llIllIIIIIllIlIIIIlI("BLUE_ORCHID", 2, "blue_orchid"), 
    IlIIIlIlIIIllIlIlIIl("ALLIUM", 3, "allium"), 
    IlIlIIIllIllIIIIIllI("HOUSTONIA", 4, "houstonia"), 
    IllIIlllIIIIlllIIlIl("RED_TULIP", 5, "red_tulip"), 
    llllIIIlIlllIlIIIIIl("ORANGE_TULIP", 6, "orange_tulip"), 
    lIIIIlIIIIIlllIllIII("WHITE_TULIP", 7, "white_tulip"), 
    lIIIlllIIIllIIIllIII("PINK_TULIP", 8, "pink_tulip"), 
    llIIlIIIlIIIllIlIIIl("OXEYE_DAISY", 9, "oxeye_daisy"), 
    llIllIlIIIIllIlIIllI("DANDELION", 10, "dandelion"), 
    lIlIlIIIllIIllIIIllI("OAK_SAPLING", 11, "oak_sapling"), 
    IlIlIIIllIIllIlllllI("SPRUCE_SAPLING", 12, "spruce_sapling"), 
    IIIIlllIIIIIIlIIIlll("BIRCH_SAPLING", 13, "birch_sapling"), 
    llllIIllllIlIlIIIIll("JUNGLE_SAPLING", 14, "jungle_sapling"), 
    IlIllIlIlIIIlIlIlIII("ACACIA_SAPLING", 15, "acacia_sapling"), 
    IIlllIIlIllIllIlIIll("DARK_OAK_SAPLING", 16, "dark_oak_sapling"), 
    lllIIIIlllllIlIIllIl("MUSHROOM_RED", 17, "mushroom_red"), 
    IlIlIIIIIIlllIlIllIl("MUSHROOM_BROWN", 18, "mushroom_brown"), 
    IIllIIllIIIlIlIIIIlI("DEAD_BUSH", 19, "dead_bush"), 
    IIIlIIIlIlIIlllIIlll("FERN", 20, "fern"), 
    IlIlIIIlIIlIlIIlllIl("CACTUS", 21, "cactus");
    
    private final String IlllllllIIIlIIIlIlII;
    
    static {
        IIlIIIIlllIlllllIlII = new IllllIIlIlIllIIIllII[] { IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll, IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl, IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI, IllllIIlIlIllIIIllII.IlIIIlIlIIIllIlIlIIl, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI, IllllIIlIlIllIIIllII.IllIIlllIIIIlllIIlIl, IllllIIlIlIllIIIllII.llllIIIlIlllIlIIIIIl, IllllIIlIlIllIIIllII.lIIIIlIIIIIlllIllIII, IllllIIlIlIllIIIllII.lIIIlllIIIllIIIllIII, IllllIIlIlIllIIIllII.llIIlIIIlIIIllIlIIIl, IllllIIlIlIllIIIllII.llIllIlIIIIllIlIIllI, IllllIIlIlIllIIIllII.lIlIlIIIllIIllIIIllI, IllllIIlIlIllIIIllII.IlIlIIIllIIllIlllllI, IllllIIlIlIllIIIllII.IIIIlllIIIIIIlIIIlll, IllllIIlIlIllIIIllII.llllIIllllIlIlIIIIll, IllllIIlIlIllIIIllII.IlIllIlIlIIIlIlIlIII, IllllIIlIlIllIIIllII.IIlllIIlIllIllIlIIll, IllllIIlIlIllIIIllII.lllIIIIlllllIlIIllIl, IllllIIlIlIllIIIllII.IlIlIIIIIIlllIlIllIl, IllllIIlIlIllIIIllII.IIllIIllIIIlIlIIIIlI, IllllIIlIlIllIIIllII.IIIlIIIlIlIIlllIIlll, IllllIIlIlIllIIIllII.IlIlIIIlIIlIlIIlllIl };
    }
    
    private IllllIIlIlIllIIIllII(final String s, final int n, final String illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
    
    @Override
    public String toString() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlllllllIIIlIIIlIlII;
    }
}
