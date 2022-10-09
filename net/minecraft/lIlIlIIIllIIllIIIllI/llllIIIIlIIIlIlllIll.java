package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.util.zip.*;
import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll
{
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        final DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));
        IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
        try {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(dataInputStream, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
        }
        finally {
            dataInputStream.close();
        }
        dataInputStream.close();
        return llllIIIIlIIIlIlllIll;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final OutputStream outputStream) {
        final DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));
        try {
            llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
        dataOutputStream.close();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final File file) {
        final File file2 = new File(String.valueOf(file.getAbsolutePath()) + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }
    
    public static void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final File file) {
        final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
        dataOutputStream.close();
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final File file) {
        if (!file.exists()) {
            return null;
        }
        final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
        try {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(dataInputStream, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
        }
        finally {
            dataInputStream.close();
        }
        dataInputStream.close();
        return llllIIIIlIIIlIlllIll;
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final DataInputStream dataInputStream) {
        return llllIIIIlIIIlIlllIll(dataInputStream, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final DataInput dataInput, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(dataInput, 0, llIIlIIIlIIIllIlIIIl);
        if (llllIIIIlIIIlIlllIll instanceof IIIIlllIIIIIIlIIIlll) {
            return (IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll;
        }
        throw new IOException("Root tag must be a named compound tag");
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final DataOutput dataOutput) {
        llllIIIIlIIIlIlllIll((llllIIIlIlllIlIIIIIl)iiiIlllIIIIIIlIIIlll, dataOutput);
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final DataOutput dataOutput) {
        dataOutput.writeByte(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll());
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() != 0) {
            dataOutput.writeUTF("");
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(dataOutput);
        }
    }
    
    private static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final byte byte1 = dataInput.readByte();
        if (byte1 == 0) {
            return new lllIIIIlllllIlIIllIl();
        }
        dataInput.readUTF();
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(byte1);
        try {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(dataInput, n, llIIlIIIlIIIllIlIIIl);
            return llllIIIIlIIIlIlllIll;
        }
        catch (IOException ex) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ex, "Loading NBT data");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("NBT Tag");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Tag name", "[UNNAMED TAG]");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Tag type", byte1);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
}
