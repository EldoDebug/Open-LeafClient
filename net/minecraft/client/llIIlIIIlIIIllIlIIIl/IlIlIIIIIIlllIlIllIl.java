package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import com.google.common.base.*;
import com.google.common.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;
import org.apache.commons.io.*;
import java.io.*;
import java.util.*;

public class IlIlIIIIIIlllIlIllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IlIlIIIIIIlllIlIllIl(final File file, final String s) {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        if (s != null) {
            final File file2 = new File(file, "objects");
            final File file3 = new File(file, "indexes/" + s + ".json");
            Reader reader = null;
            try {
                reader = Files.newReader(file3, Charsets.UTF_8);
                final JsonObject llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(new JsonParser().parse(reader).getAsJsonObject(), "objects", (JsonObject)null);
                if (llllIIIIlIIIlIlllIll != null) {
                    for (final Map.Entry<K, JsonObject> entry : llllIIIIlIIIlIlllIll.entrySet()) {
                        final JsonObject jsonObject = entry.getValue();
                        final String[] split = ((String)entry.getKey()).split("/", 2);
                        final String s2 = (split.length == 1) ? split[0] : (String.valueOf(split[0]) + ":" + split[1]);
                        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(jsonObject, "hash");
                        this.IlIlIlIlIlllllllllIl.put(s2, new File(file2, String.valueOf(illIIlllIIIIlllIIlIl.substring(0, 2)) + "/" + illIIlllIIIIlllIIlIl));
                    }
                }
            }
            catch (JsonParseException ex) {
                IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.error("Unable to parse resource index file: " + file3);
            }
            catch (FileNotFoundException ex2) {
                IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.error("Can't find the resource index file: " + file3);
            }
            finally {
                IOUtils.closeQuietly(reader);
            }
            IOUtils.closeQuietly(reader);
        }
    }
    
    public Map llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
