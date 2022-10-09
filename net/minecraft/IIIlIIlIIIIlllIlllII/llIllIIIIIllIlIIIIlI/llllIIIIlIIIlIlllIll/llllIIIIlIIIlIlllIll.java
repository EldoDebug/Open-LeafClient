package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import java.io.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll implements lIIIIlIIIIIlllIllIII, IlIlIIIllIllIIIIIllI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private Map IlIlIlIlIlllllllllIl;
    private Set llIllIIIIIllIlIIIIlI;
    private final File IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllIIIIlIIIlIlllIll(final File ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = new ConcurrentHashMap();
        this.llIllIIIIIllIlIIIIlI = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
        this.IlIlIIIllIllIIIIIllI = false;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2) {
        IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.get(new IlIlIlIlIlllllllllIl(n, n2));
        if (llllIIIIlIIIlIlllIll == null) {
            final DataInputStream ilIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl, n, n2);
            if (ilIlIlIlIlllllllllIl == null) {
                return null;
            }
            llllIIIIlIIIlIlllIll = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        return this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, n2, llllIIIIlIIIlIlllIll);
    }
    
    protected net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (!iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Level", 10)) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Chunk file at " + n + "," + n2 + " is missing level data, skipping");
            return null;
        }
        final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Level");
        if (!ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Sections", 9)) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Chunk file at " + n + "," + n2 + " is missing block data, skipping");
            return null;
        }
        net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIllIIllIlllllI);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2)) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Chunk file at " + n + "," + n2 + " is in the wrong location; relocating. (Expected " + n + ", " + n2 + ", got " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll + ", " + llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + ")");
            ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll("xPos", n);
            ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll("zPos", n2);
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIllIIllIlllllI);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        illlllllIIIlIIIlIlII.IlllllllIIIlIIIlIlII();
        try {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Level", iiiIlllIIIIIIlIIIlll2);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, iiiIlllIIIIIIlIIIlll2);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), iiiIlllIIIIIIlIIIlll);
        }
        catch (Exception ex) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Failed to save chunk", (Throwable)ex);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (!this.llIllIIIIIllIlIIIIlI.contains(ilIlIlIlIlllllllllIl)) {
            this.IlIlIlIlIlllllllllIl.put(ilIlIlIlIlllllllllIl, iiiIlllIIIIIIlIIIlll);
        }
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl.isEmpty()) {
            if (this.IlIlIIIllIllIIIIIllI) {
                net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[] { this.IlIIIlIlIIIllIlIlIIl.getName() });
            }
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.keySet().iterator().next();
        boolean b;
        try {
            this.llIllIIIIIllIlIIIIlI.add(ilIlIlIlIlllllllllIl);
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = this.IlIlIlIlIlllllllllIl.remove(ilIlIlIlIlllllllllIl);
            if (iiiIlllIIIIIIlIIIlll != null) {
                try {
                    this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, iiiIlllIIIIIIlIIIlll);
                }
                catch (Exception ex) {
                    net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.error("Failed to save chunk", (Throwable)ex);
                }
            }
            b = true;
        }
        finally {
            this.llIllIIIIIllIlIIIIlI.remove(ilIlIlIlIlllllllllIl);
        }
        this.llIllIIIIIllIlIIIIlI.remove(ilIlIlIlIlllllllllIl);
        return b;
    }
    
    private void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final DataOutputStream llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
        net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)llIllIIIIIllIlIIIIlI);
        llIllIIIIIllIlIIIIlI.close();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        try {
            this.IlIlIIIllIllIIIIIllI = true;
            while (true) {
                if (this.llllIIIIlIIIlIlllIll()) {
                    continue;
                }
            }
        }
        finally {
            this.IlIlIIIllIllIIIIIllI = false;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("V", (byte)1);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xPos", llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zPos", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LastUpdate", illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HeightMap", llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TerrainPopulated", llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LightPopulated", llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("InhabitedTime", llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII());
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        final boolean b = !illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[] array;
        for (int length = (array = ilIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = array[i];
            if (llllIIIlIlllIlIIIIIl != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Y", (byte)(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI() >> 4 & 0xFF));
                final byte[] array2 = new byte[llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI().length];
                final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
                lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = null;
                for (int j = 0; j < llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI().length; ++j) {
                    final char c = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI()[j];
                    final int n = j & 0xF;
                    final int n2 = j >> 8 & 0xF;
                    final int n3 = j >> 4 & 0xF;
                    if (c >> 12 != 0) {
                        if (liiIlllIIIllIIIllIII2 == null) {
                            liiIlllIIIllIIIllIII2 = new lIIIlllIIIllIIIllIII();
                        }
                        liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll(n, n2, n3, c >> 12);
                    }
                    array2[j] = (byte)(c >> 4 & 0xFF);
                    liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, n3, c & '\u000f');
                }
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Blocks", array2);
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Data", liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
                if (liiIlllIIIllIIIllIII2 != null) {
                    iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Add", liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll());
                }
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("BlockLight", llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll());
                if (b) {
                    iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("SkyLight", llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll());
                }
                else {
                    iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("SkyLight", new byte[llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll().length]);
                }
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Sections", ilIlIIIlIIlIlIIlllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Biomes", llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI());
        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(false);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl();
        for (int k = 0; k < llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl().length; ++k) {
            for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl()[k]) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new IIIIlllIIIIIIlIIIlll();
                if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll3)) {
                    llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(true);
                    ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll3);
                }
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Entities", ilIlIIIlIIlIlIIlllIl2);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl3 = new IlIlIIIlIIlIlIIlllIl();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl().values()) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll4 = new IIIIlllIIIIIIlIIIlll();
            ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll4);
            ilIlIIIlIIlIlIIlllIl3.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll4);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileEntities", ilIlIIIlIIlIlIIlllIl3);
        final List llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, false);
        if (llllIIIIlIIIlIlllIll2 != null) {
            final long iiIlIIlIIIIlllIlllII = illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII();
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl4 = new IlIlIIIlIIlIlIIlllIl();
            for (final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl : llllIIIIlIIIlIlllIll2) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll5 = new IIIIlllIIIIIIlIIIlll();
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll());
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("i", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("x", ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("y", ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("z", ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("t", (int)(ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl - iiIlIIlIIIIlllIlllII));
                iiiIlllIIIIIIlIIIlll5.llllIIIIlIIIlIlllIll("p", ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI);
                ilIlIIIlIIlIlIIlllIl4.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll5);
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileTicks", ilIlIIIlIIlIlIIlllIl4);
        }
    }
    
    private net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("xPos"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("zPos"));
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI("HeightMap"));
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("TerrainPopulated"));
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("LightPopulated"));
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("InhabitedTime"));
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Sections", 10);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[] array = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[16];
        final boolean b = !illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final byte ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Y");
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl << 4, b);
            final byte[] llIllIlIIIIllIlIIllI = ilIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI("Blocks");
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI("Data"));
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("Add", 7) ? new lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI("Add")) : null;
            final char[] array2 = new char[llIllIlIIIIllIlIIllI.length];
            for (int j = 0; j < array2.length; ++j) {
                final int n = j & 0xF;
                final int n2 = j >> 8 & 0xF;
                final int n3 = j >> 4 & 0xF;
                array2[j] = (char)(((liiIlllIIIllIIIllIII2 != null) ? liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll(n, n2, n3) : 0) << 12 | (llIllIlIIIIllIlIIllI[j] & 0xFF) << 4 | liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, n3));
            }
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(array2);
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI("BlockLight")));
            if (b) {
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(new lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI("SkyLight")));
            }
            llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
            array[ilIIIlIlIIIllIlIlIIl] = llllIIIlIlllIlIIIIIl;
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Biomes", 7)) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("Biomes"));
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Entities", 10);
        if (llIllIIIIIllIlIIIIlI2 != null) {
            for (int k = 0; k < llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI(); ++k) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl2 = llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(k);
                final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, illlllllIIIlIIIlIlII);
                llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(true);
                if (llllIIIIlIIIlIlllIll2 != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll2;
                    for (IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = ilIlIlIlIlllllllllIl2; ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Riding", 10); ilIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI("Riding")) {
                        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI("Riding"), illlllllIIIlIIIlIlII);
                        if (llllIIIIlIIIlIlllIll3 != null) {
                            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                            llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                        }
                        llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll3;
                    }
                }
            }
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI4 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("TileEntities", 10);
        if (llIllIIIIIllIlIIIIlI4 != null) {
            for (int l = 0; l < llIllIIIIIllIlIIIIlI4.IlIlIIIllIllIIIIIllI(); ++l) {
                final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI5 = net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(l));
                if (llIllIIIIIllIlIIIIlI5 != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI5);
                }
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("TileTicks", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI6 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("TileTicks", 10);
            if (llIllIIIIIllIlIIIIlI6 != null) {
                for (int n4 = 0; n4 < llIllIIIIIllIlIIIIlI6.IlIlIIIllIllIIIIIllI(); ++n4) {
                    final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl3 = llIllIIIIIllIlIIIIlI6.IlIlIlIlIlllllllllIl(n4);
                    net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4;
                    if (ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl("i", 8)) {
                        llllIIIIlIIIlIlllIll4 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3.llIIlIIIlIIIllIlIIIl("i"));
                    }
                    else {
                        llllIIIIlIIIlIlllIll4 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("i"));
                    }
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("x"), ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("y"), ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("z")), llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("t"), ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl("p"));
                }
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
}
