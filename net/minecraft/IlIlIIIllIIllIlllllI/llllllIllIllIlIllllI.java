package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import io.netty.handler.codec.*;
import com.google.common.base.*;
import java.nio.*;
import java.io.*;
import java.nio.channels.*;
import io.netty.buffer.*;
import java.nio.charset.*;
import io.netty.util.*;

public class llllllIllIllIlIllllI extends ByteBuf
{
    private final ByteBuf llllIIIIlIIIlIlllIll;
    
    public llllllIllIllIlIllllI(final ByteBuf llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        for (int i = 1; i < 5; ++i) {
            if ((n & -1 << i * 7) == 0x0) {
                return i;
            }
        }
        return 5;
    }
    
    public void llllIIIIlIIIlIlllIll(final byte[] array) {
        this.IlIlIlIlIlllllllllIl(array.length);
        this.writeBytes(array);
    }
    
    public byte[] llllIIIIlIIIlIlllIll() {
        final byte[] array = new byte[this.IlIIIlIlIIIllIlIlIIl()];
        this.readBytes(array);
        return array;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.readLong());
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.writeLong(ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl());
    }
    
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI(32767));
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll));
    }
    
    public Enum llllIIIIlIIIlIlllIll(final Class clazz) {
        return ((Enum[])clazz.getEnumConstants())[this.IlIIIlIlIIIllIlIlIIl()];
    }
    
    public void llllIIIIlIIIlIlllIll(final Enum enum1) {
        this.IlIlIlIlIlllllllllIl(enum1.ordinal());
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        int n = 0;
        int n2 = 0;
        byte byte1;
        do {
            byte1 = this.readByte();
            n |= (byte1 & 0x7F) << n2++ * 7;
            if (n2 > 5) {
                throw new RuntimeException("VarInt too big");
            }
        } while ((byte1 & 0x80) == 0x80);
        return n;
    }
    
    public long IlIlIIIllIllIIIIIllI() {
        long n = 0L;
        int n2 = 0;
        byte byte1;
        do {
            byte1 = this.readByte();
            n |= (long)(byte1 & 0x7F) << n2++ * 7;
            if (n2 > 10) {
                throw new RuntimeException("VarLong too big");
            }
        } while ((byte1 & 0x80) == 0x80);
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final UUID uuid) {
        this.writeLong(uuid.getMostSignificantBits());
        this.writeLong(uuid.getLeastSignificantBits());
    }
    
    public UUID IllIIlllIIIIlllIIlIl() {
        return new UUID(this.readLong(), this.readLong());
    }
    
    public void IlIlIlIlIlllllllllIl(int n) {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.writeByte((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.writeByte(n);
    }
    
    public void llllIIIIlIIIlIlllIll(long n) {
        while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
            this.writeByte((int)(n & 0x7FL) | 0x80);
            n >>>= 7;
        }
        this.writeByte((int)n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll == null) {
            this.writeByte(0);
        }
        else {
            try {
                net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)new ByteBufOutputStream(this));
            }
            catch (IOException cause) {
                throw new EncoderException(cause);
            }
        }
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIlIlllIlIIIIIl() {
        final int readerIndex = this.readerIndex();
        if (this.readByte() == 0) {
            return null;
        }
        this.readerIndex(readerIndex);
        return net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new ByteBufInputStream(this), new llIIlIIIlIIIllIlIIIl(2097152L));
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            this.writeShort(-1);
        }
        else {
            this.writeShort(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()));
            this.writeByte(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl);
            this.writeShort(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
            IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = null;
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl() || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII()) {
                llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            }
            this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
        }
    }
    
    public lllIIIIlIlIllIIlIIIl lIIIIlIIIIIlllIllIII() {
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        final short short1 = this.readShort();
        if (short1 >= 0) {
            lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(short1), this.readByte(), this.readShort());
            lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl());
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public String llIllIIIIIllIlIIIIlI(final int n) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl > n * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + ilIIIlIlIIIllIlIlIIl + " > " + n * 4 + ")");
        }
        if (ilIIIlIlIIIllIlIlIIl < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        final String s = new String(this.readBytes(ilIIIlIlIIIllIlIlIIl).array(), Charsets.UTF_8);
        if (s.length() > n) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + ilIIIlIlIIIllIlIlIIl + " > " + n + ")");
        }
        return s;
    }
    
    public llllllIllIllIlIllllI llllIIIIlIIIlIlllIll(final String s) {
        final byte[] bytes = s.getBytes(Charsets.UTF_8);
        if (bytes.length > 32767) {
            throw new EncoderException("String too big (was " + s.length() + " bytes encoded, max " + 32767 + ")");
        }
        this.IlIlIlIlIlllllllllIl(bytes.length);
        this.writeBytes(bytes);
        return this;
    }
    
    @Override
    public int capacity() {
        return this.llllIIIIlIIIlIlllIll.capacity();
    }
    
    @Override
    public ByteBuf capacity(final int n) {
        return this.llllIIIIlIIIlIlllIll.capacity(n);
    }
    
    @Override
    public int maxCapacity() {
        return this.llllIIIIlIIIlIlllIll.maxCapacity();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.llllIIIIlIIIlIlllIll.alloc();
    }
    
    @Override
    public ByteOrder order() {
        return this.llllIIIIlIIIlIlllIll.order();
    }
    
    @Override
    public ByteBuf order(final ByteOrder byteOrder) {
        return this.llllIIIIlIIIlIlllIll.order(byteOrder);
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.llllIIIIlIIIlIlllIll.unwrap();
    }
    
    @Override
    public boolean isDirect() {
        return this.llllIIIIlIIIlIlllIll.isDirect();
    }
    
    @Override
    public int readerIndex() {
        return this.llllIIIIlIIIlIlllIll.readerIndex();
    }
    
    @Override
    public ByteBuf readerIndex(final int n) {
        return this.llllIIIIlIIIlIlllIll.readerIndex(n);
    }
    
    @Override
    public int writerIndex() {
        return this.llllIIIIlIIIlIlllIll.writerIndex();
    }
    
    @Override
    public ByteBuf writerIndex(final int n) {
        return this.llllIIIIlIIIlIlllIll.writerIndex(n);
    }
    
    @Override
    public ByteBuf setIndex(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setIndex(n, n2);
    }
    
    @Override
    public int readableBytes() {
        return this.llllIIIIlIIIlIlllIll.readableBytes();
    }
    
    @Override
    public int writableBytes() {
        return this.llllIIIIlIIIlIlllIll.writableBytes();
    }
    
    @Override
    public int maxWritableBytes() {
        return this.llllIIIIlIIIlIlllIll.maxWritableBytes();
    }
    
    @Override
    public boolean isReadable() {
        return this.llllIIIIlIIIlIlllIll.isReadable();
    }
    
    @Override
    public boolean isReadable(final int n) {
        return this.llllIIIIlIIIlIlllIll.isReadable(n);
    }
    
    @Override
    public boolean isWritable() {
        return this.llllIIIIlIIIlIlllIll.isWritable();
    }
    
    @Override
    public boolean isWritable(final int n) {
        return this.llllIIIIlIIIlIlllIll.isWritable(n);
    }
    
    @Override
    public ByteBuf clear() {
        return this.llllIIIIlIIIlIlllIll.clear();
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        return this.llllIIIIlIIIlIlllIll.markReaderIndex();
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        return this.llllIIIIlIIIlIlllIll.resetReaderIndex();
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        return this.llllIIIIlIIIlIlllIll.markWriterIndex();
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        return this.llllIIIIlIIIlIlllIll.resetWriterIndex();
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        return this.llllIIIIlIIIlIlllIll.discardReadBytes();
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        return this.llllIIIIlIIIlIlllIll.discardSomeReadBytes();
    }
    
    @Override
    public ByteBuf ensureWritable(final int n) {
        return this.llllIIIIlIIIlIlllIll.ensureWritable(n);
    }
    
    @Override
    public int ensureWritable(final int n, final boolean b) {
        return this.llllIIIIlIIIlIlllIll.ensureWritable(n, b);
    }
    
    @Override
    public boolean getBoolean(final int n) {
        return this.llllIIIIlIIIlIlllIll.getBoolean(n);
    }
    
    @Override
    public byte getByte(final int n) {
        return this.llllIIIIlIIIlIlllIll.getByte(n);
    }
    
    @Override
    public short getUnsignedByte(final int n) {
        return this.llllIIIIlIIIlIlllIll.getUnsignedByte(n);
    }
    
    @Override
    public short getShort(final int n) {
        return this.llllIIIIlIIIlIlllIll.getShort(n);
    }
    
    @Override
    public int getUnsignedShort(final int n) {
        return this.llllIIIIlIIIlIlllIll.getUnsignedShort(n);
    }
    
    @Override
    public int getMedium(final int n) {
        return this.llllIIIIlIIIlIlllIll.getMedium(n);
    }
    
    @Override
    public int getUnsignedMedium(final int n) {
        return this.llllIIIIlIIIlIlllIll.getUnsignedMedium(n);
    }
    
    @Override
    public int getInt(final int n) {
        return this.llllIIIIlIIIlIlllIll.getInt(n);
    }
    
    @Override
    public long getUnsignedInt(final int n) {
        return this.llllIIIIlIIIlIlllIll.getUnsignedInt(n);
    }
    
    @Override
    public long getLong(final int n) {
        return this.llllIIIIlIIIlIlllIll.getLong(n);
    }
    
    @Override
    public char getChar(final int n) {
        return this.llllIIIIlIIIlIlllIll.getChar(n);
    }
    
    @Override
    public float getFloat(final int n) {
        return this.llllIIIIlIIIlIlllIll.getFloat(n);
    }
    
    @Override
    public double getDouble(final int n) {
        return this.llllIIIIlIIIlIlllIll.getDouble(n);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, byteBuf);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, byteBuf, n2);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, byteBuf, n2, n3);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final byte[] array) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, array);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, array, n2, n3);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final ByteBuffer byteBuffer) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, byteBuffer);
    }
    
    @Override
    public ByteBuf getBytes(final int n, final OutputStream outputStream, final int n2) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, outputStream, n2);
    }
    
    @Override
    public int getBytes(final int n, final GatheringByteChannel gatheringByteChannel, final int n2) {
        return this.llllIIIIlIIIlIlllIll.getBytes(n, gatheringByteChannel, n2);
    }
    
    @Override
    public ByteBuf setBoolean(final int n, final boolean b) {
        return this.llllIIIIlIIIlIlllIll.setBoolean(n, b);
    }
    
    @Override
    public ByteBuf setByte(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setByte(n, n2);
    }
    
    @Override
    public ByteBuf setShort(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setShort(n, n2);
    }
    
    @Override
    public ByteBuf setMedium(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setMedium(n, n2);
    }
    
    @Override
    public ByteBuf setInt(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setInt(n, n2);
    }
    
    @Override
    public ByteBuf setLong(final int n, final long n2) {
        return this.llllIIIIlIIIlIlllIll.setLong(n, n2);
    }
    
    @Override
    public ByteBuf setChar(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setChar(n, n2);
    }
    
    @Override
    public ByteBuf setFloat(final int n, final float n2) {
        return this.llllIIIIlIIIlIlllIll.setFloat(n, n2);
    }
    
    @Override
    public ByteBuf setDouble(final int n, final double n2) {
        return this.llllIIIIlIIIlIlllIll.setDouble(n, n2);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, byteBuf);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, byteBuf, n2);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final ByteBuf byteBuf, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, byteBuf, n2, n3);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final byte[] array) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, array);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final byte[] array, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, array, n2, n3);
    }
    
    @Override
    public ByteBuf setBytes(final int n, final ByteBuffer byteBuffer) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, byteBuffer);
    }
    
    @Override
    public int setBytes(final int n, final InputStream inputStream, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, inputStream, n2);
    }
    
    @Override
    public int setBytes(final int n, final ScatteringByteChannel scatteringByteChannel, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setBytes(n, scatteringByteChannel, n2);
    }
    
    @Override
    public ByteBuf setZero(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.setZero(n, n2);
    }
    
    @Override
    public boolean readBoolean() {
        return this.llllIIIIlIIIlIlllIll.readBoolean();
    }
    
    @Override
    public byte readByte() {
        return this.llllIIIIlIIIlIlllIll.readByte();
    }
    
    @Override
    public short readUnsignedByte() {
        return this.llllIIIIlIIIlIlllIll.readUnsignedByte();
    }
    
    @Override
    public short readShort() {
        return this.llllIIIIlIIIlIlllIll.readShort();
    }
    
    @Override
    public int readUnsignedShort() {
        return this.llllIIIIlIIIlIlllIll.readUnsignedShort();
    }
    
    @Override
    public int readMedium() {
        return this.llllIIIIlIIIlIlllIll.readMedium();
    }
    
    @Override
    public int readUnsignedMedium() {
        return this.llllIIIIlIIIlIlllIll.readUnsignedMedium();
    }
    
    @Override
    public int readInt() {
        return this.llllIIIIlIIIlIlllIll.readInt();
    }
    
    @Override
    public long readUnsignedInt() {
        return this.llllIIIIlIIIlIlllIll.readUnsignedInt();
    }
    
    @Override
    public long readLong() {
        return this.llllIIIIlIIIlIlllIll.readLong();
    }
    
    @Override
    public char readChar() {
        return this.llllIIIIlIIIlIlllIll.readChar();
    }
    
    @Override
    public float readFloat() {
        return this.llllIIIIlIIIlIlllIll.readFloat();
    }
    
    @Override
    public double readDouble() {
        return this.llllIIIIlIIIlIlllIll.readDouble();
    }
    
    @Override
    public ByteBuf readBytes(final int n) {
        return this.llllIIIIlIIIlIlllIll.readBytes(n);
    }
    
    @Override
    public ByteBuf readSlice(final int n) {
        return this.llllIIIIlIIIlIlllIll.readSlice(n);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf byteBuf) {
        return this.llllIIIIlIIIlIlllIll.readBytes(byteBuf);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n) {
        return this.llllIIIIlIIIlIlllIll.readBytes(byteBuf, n);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.readBytes(byteBuf, n, n2);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] array) {
        return this.llllIIIIlIIIlIlllIll.readBytes(array);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] array, final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.readBytes(array, n, n2);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer byteBuffer) {
        return this.llllIIIIlIIIlIlllIll.readBytes(byteBuffer);
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream outputStream, final int n) {
        return this.llllIIIIlIIIlIlllIll.readBytes(outputStream, n);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel gatheringByteChannel, final int n) {
        return this.llllIIIIlIIIlIlllIll.readBytes(gatheringByteChannel, n);
    }
    
    @Override
    public ByteBuf skipBytes(final int n) {
        return this.llllIIIIlIIIlIlllIll.skipBytes(n);
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean b) {
        return this.llllIIIIlIIIlIlllIll.writeBoolean(b);
    }
    
    @Override
    public ByteBuf writeByte(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeByte(n);
    }
    
    @Override
    public ByteBuf writeShort(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeShort(n);
    }
    
    @Override
    public ByteBuf writeMedium(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeMedium(n);
    }
    
    @Override
    public ByteBuf writeInt(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeInt(n);
    }
    
    @Override
    public ByteBuf writeLong(final long n) {
        return this.llllIIIIlIIIlIlllIll.writeLong(n);
    }
    
    @Override
    public ByteBuf writeChar(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeChar(n);
    }
    
    @Override
    public ByteBuf writeFloat(final float n) {
        return this.llllIIIIlIIIlIlllIll.writeFloat(n);
    }
    
    @Override
    public ByteBuf writeDouble(final double n) {
        return this.llllIIIIlIIIlIlllIll.writeDouble(n);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf byteBuf) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(byteBuf);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(byteBuf, n);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf byteBuf, final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(byteBuf, n, n2);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] array) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(array);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] array, final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(array, n, n2);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer byteBuffer) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(byteBuffer);
    }
    
    @Override
    public int writeBytes(final InputStream inputStream, final int n) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(inputStream, n);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel scatteringByteChannel, final int n) {
        return this.llllIIIIlIIIlIlllIll.writeBytes(scatteringByteChannel, n);
    }
    
    @Override
    public ByteBuf writeZero(final int n) {
        return this.llllIIIIlIIIlIlllIll.writeZero(n);
    }
    
    @Override
    public int indexOf(final int n, final int n2, final byte b) {
        return this.llllIIIIlIIIlIlllIll.indexOf(n, n2, b);
    }
    
    @Override
    public int bytesBefore(final byte b) {
        return this.llllIIIIlIIIlIlllIll.bytesBefore(b);
    }
    
    @Override
    public int bytesBefore(final int n, final byte b) {
        return this.llllIIIIlIIIlIlllIll.bytesBefore(n, b);
    }
    
    @Override
    public int bytesBefore(final int n, final int n2, final byte b) {
        return this.llllIIIIlIIIlIlllIll.bytesBefore(n, n2, b);
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor byteBufProcessor) {
        return this.llllIIIIlIIIlIlllIll.forEachByte(byteBufProcessor);
    }
    
    @Override
    public int forEachByte(final int n, final int n2, final ByteBufProcessor byteBufProcessor) {
        return this.llllIIIIlIIIlIlllIll.forEachByte(n, n2, byteBufProcessor);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor byteBufProcessor) {
        return this.llllIIIIlIIIlIlllIll.forEachByteDesc(byteBufProcessor);
    }
    
    @Override
    public int forEachByteDesc(final int n, final int n2, final ByteBufProcessor byteBufProcessor) {
        return this.llllIIIIlIIIlIlllIll.forEachByteDesc(n, n2, byteBufProcessor);
    }
    
    @Override
    public ByteBuf copy() {
        return this.llllIIIIlIIIlIlllIll.copy();
    }
    
    @Override
    public ByteBuf copy(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.copy(n, n2);
    }
    
    @Override
    public ByteBuf slice() {
        return this.llllIIIIlIIIlIlllIll.slice();
    }
    
    @Override
    public ByteBuf slice(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.slice(n, n2);
    }
    
    @Override
    public ByteBuf duplicate() {
        return this.llllIIIIlIIIlIlllIll.duplicate();
    }
    
    @Override
    public int nioBufferCount() {
        return this.llllIIIIlIIIlIlllIll.nioBufferCount();
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.llllIIIIlIIIlIlllIll.nioBuffer();
    }
    
    @Override
    public ByteBuffer nioBuffer(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.nioBuffer(n, n2);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.internalNioBuffer(n, n2);
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.llllIIIIlIIIlIlllIll.nioBuffers();
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll.nioBuffers(n, n2);
    }
    
    @Override
    public boolean hasArray() {
        return this.llllIIIIlIIIlIlllIll.hasArray();
    }
    
    @Override
    public byte[] array() {
        return this.llllIIIIlIIIlIlllIll.array();
    }
    
    @Override
    public int arrayOffset() {
        return this.llllIIIIlIIIlIlllIll.arrayOffset();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.llllIIIIlIIIlIlllIll.hasMemoryAddress();
    }
    
    @Override
    public long memoryAddress() {
        return this.llllIIIIlIIIlIlllIll.memoryAddress();
    }
    
    @Override
    public String toString(final Charset charset) {
        return this.llllIIIIlIIIlIlllIll.toString(charset);
    }
    
    @Override
    public String toString(final int n, final int n2, final Charset charset) {
        return this.llllIIIIlIIIlIlllIll.toString(n, n2, charset);
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.llllIIIIlIIIlIlllIll.equals(o);
    }
    
    @Override
    public int compareTo(final ByteBuf byteBuf) {
        return this.llllIIIIlIIIlIlllIll.compareTo(byteBuf);
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll.toString();
    }
    
    @Override
    public ByteBuf retain(final int n) {
        return this.llllIIIIlIIIlIlllIll.retain(n);
    }
    
    @Override
    public ByteBuf retain() {
        return this.llllIIIIlIIIlIlllIll.retain();
    }
    
    @Override
    public int refCnt() {
        return this.llllIIIIlIIIlIlllIll.refCnt();
    }
    
    @Override
    public boolean release() {
        return this.llllIIIIlIIIlIlllIll.release();
    }
    
    @Override
    public boolean release(final int n) {
        return this.llllIIIIlIIIlIlllIll.release(n);
    }
}
