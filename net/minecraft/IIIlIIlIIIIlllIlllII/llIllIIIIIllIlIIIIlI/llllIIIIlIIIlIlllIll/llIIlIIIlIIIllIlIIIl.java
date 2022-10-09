package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.util.*;
import com.google.common.collect.*;
import java.io.*;
import java.util.zip.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;

public class llIIlIIIlIIIllIlIIIl
{
    private static final byte[] llllIIIIlIIIlIlllIll;
    private final File IlIlIlIlIlllllllllIl;
    private RandomAccessFile llIllIIIIIllIlIIIIlI;
    private final int[] IlIIIlIlIIIllIlIlIIl;
    private final int[] IlIlIIIllIllIIIIIllI;
    private List IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = new byte[4096];
    }
    
    public llIIlIIIlIIIllIlIIIl(final File ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = new int[1024];
        this.IlIlIIIllIllIIIIIllI = new int[1024];
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIlIlllIlIIIIIl = 0;
        try {
            if (ilIlIlIlIlllllllllIl.exists()) {
                this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lastModified();
            }
            this.llIllIIIIIllIlIIIIlI = new RandomAccessFile(ilIlIlIlIlllllllllIl, "rw");
            if (this.llIllIIIIIllIlIIIIlI.length() < 4096L) {
                for (int i = 0; i < 1024; ++i) {
                    this.llIllIIIIIllIlIIIIlI.writeInt(0);
                }
                for (int j = 0; j < 1024; ++j) {
                    this.llIllIIIIIllIlIIIIlI.writeInt(0);
                }
                this.llllIIIlIlllIlIIIIIl += 8192;
            }
            if ((this.llIllIIIIIllIlIIIIlI.length() & 0xFFFL) != 0x0L) {
                for (int n = 0; n < (this.llIllIIIIIllIlIIIIlI.length() & 0xFFFL); ++n) {
                    this.llIllIIIIIllIlIIIIlI.write(0);
                }
            }
            final int n2 = (int)this.llIllIIIIIllIlIIIIlI.length() / 4096;
            this.IllIIlllIIIIlllIIlIl = Lists.newArrayListWithCapacity(n2);
            for (int k = 0; k < n2; ++k) {
                this.IllIIlllIIIIlllIIlIl.add(true);
            }
            this.IllIIlllIIIIlllIIlIl.set(0, false);
            this.IllIIlllIIIIlllIIlIl.set(1, false);
            this.llIllIIIIIllIlIIIIlI.seek(0L);
            for (int l = 0; l < 1024; ++l) {
                final int int1 = this.llIllIIIIIllIlIIIIlI.readInt();
                this.IlIIIlIlIIIllIlIlIIl[l] = int1;
                if (int1 != 0 && (int1 >> 8) + (int1 & 0xFF) <= this.IllIIlllIIIIlllIIlIl.size()) {
                    for (int n3 = 0; n3 < (int1 & 0xFF); ++n3) {
                        this.IllIIlllIIIIlllIIlIl.set((int1 >> 8) + n3, false);
                    }
                }
            }
            for (int n4 = 0; n4 < 1024; ++n4) {
                this.IlIlIIIllIllIIIIIllI[n4] = this.llIllIIIIIllIlIIIIlI.readInt();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public synchronized DataInputStream llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IlIIIlIlIIIllIlIlIIl(n, n2)) {
            return null;
        }
        try {
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(n, n2);
            if (ilIlIIIllIllIIIIIllI == 0) {
                return null;
            }
            final int n3 = ilIlIIIllIllIIIIIllI >> 8;
            final int n4 = ilIlIIIllIllIIIIIllI & 0xFF;
            if (n3 + n4 > this.IllIIlllIIIIlllIIlIl.size()) {
                return null;
            }
            this.llIllIIIIIllIlIIIIlI.seek(n3 * 4096);
            final int int1 = this.llIllIIIIIllIlIIIIlI.readInt();
            if (int1 > 4096 * n4) {
                return null;
            }
            if (int1 <= 0) {
                return null;
            }
            final byte byte1 = this.llIllIIIIIllIlIIIIlI.readByte();
            if (byte1 == 1) {
                final byte[] array = new byte[int1 - 1];
                this.llIllIIIIIllIlIIIIlI.read(array);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(array))));
            }
            if (byte1 == 2) {
                final byte[] array2 = new byte[int1 - 1];
                this.llIllIIIIIllIlIIIIlI.read(array2);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(array2))));
            }
            return null;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public DataOutputStream IlIlIlIlIlllllllllIl(final int n, final int n2) {
        DataOutputStream dataOutputStream;
        if (this.IlIIIlIlIIIllIlIlIIl(n, n2)) {
            dataOutputStream = null;
        }
        else {
            final DeflaterOutputStream deflaterOutputStream;
            dataOutputStream = new DataOutputStream(deflaterOutputStream);
            deflaterOutputStream = new DeflaterOutputStream(new llIllIlIIIIllIlIIllI(this, n, n2));
        }
        return dataOutputStream;
    }
    
    protected synchronized void llllIIIIlIIIlIlllIll(final int n, final int n2, final byte[] array, final int n3) {
        try {
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(n, n2);
            final int n4 = ilIlIIIllIllIIIIIllI >> 8;
            final int n5 = ilIlIIIllIllIIIIIllI & 0xFF;
            final int n6 = (n3 + 5) / 4096 + 1;
            if (n6 >= 256) {
                return;
            }
            if (n4 != 0 && n5 == n6) {
                this.llllIIIIlIIIlIlllIll(n4, array, n3);
            }
            else {
                for (int i = 0; i < n5; ++i) {
                    this.IllIIlllIIIIlllIIlIl.set(n4 + i, true);
                }
                int index = this.IllIIlllIIIIlllIIlIl.indexOf(true);
                int n7 = 0;
                if (index != -1) {
                    for (int j = index; j < this.IllIIlllIIIIlllIIlIl.size(); ++j) {
                        if (n7 != 0) {
                            if (this.IllIIlllIIIIlllIIlIl.get(j)) {
                                ++n7;
                            }
                            else {
                                n7 = 0;
                            }
                        }
                        else if (this.IllIIlllIIIIlllIIlIl.get(j)) {
                            index = j;
                            n7 = 1;
                        }
                        if (n7 >= n6) {
                            break;
                        }
                    }
                }
                if (n7 >= n6) {
                    final int n8 = index;
                    this.llllIIIIlIIIlIlllIll(n, n2, index << 8 | n6);
                    for (int k = 0; k < n6; ++k) {
                        this.IllIIlllIIIIlllIIlIl.set(n8 + k, false);
                    }
                    this.llllIIIIlIIIlIlllIll(n8, array, n3);
                }
                else {
                    this.llIllIIIIIllIlIIIIlI.seek(this.llIllIIIIIllIlIIIIlI.length());
                    final int size = this.IllIIlllIIIIlllIIlIl.size();
                    for (int l = 0; l < n6; ++l) {
                        this.llIllIIIIIllIlIIIIlI.write(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
                        this.IllIIlllIIIIlllIIlIl.add(false);
                    }
                    this.llllIIIlIlllIlIIIIIl += 4096 * n6;
                    this.llllIIIIlIIIlIlllIll(size, array, n3);
                    this.llllIIIIlIIIlIlllIll(n, n2, size << 8 | n6);
                }
            }
            this.IlIlIlIlIlllllllllIl(n, n2, (int)(net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI() / 1000L));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final byte[] array, final int n2) {
        this.llIllIIIIIllIlIIIIlI.seek(n * 4096);
        this.llIllIIIIIllIlIIIIlI.writeInt(n2 + 1);
        this.llIllIIIIIllIlIIIIlI.writeByte(2);
        this.llIllIIIIIllIlIIIIlI.write(array, 0, n2);
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        return n < 0 || n >= 32 || n2 < 0 || n2 >= 32;
    }
    
    private int IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        return this.IlIIIlIlIIIllIlIlIIl[n + n2 * 32];
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return this.IlIlIIIllIllIIIIIllI(n, n2) != 0;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.IlIIIlIlIIIllIlIlIIl[n + n2 * 32] = n3;
        this.llIllIIIIIllIlIIIIlI.seek((n + n2 * 32) * 4);
        this.llIllIIIIIllIlIIIIlI.writeInt(n3);
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        this.IlIlIIIllIllIIIIIllI[n + n2 * 32] = n3;
        this.llIllIIIIIllIlIIIIlI.seek(4096 + (n + n2 * 32) * 4);
        this.llIllIIIIIllIlIIIIlI.writeInt(n3);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.close();
        }
    }
}
