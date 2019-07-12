// automatically generated by the FlatBuffers compiler, do not modify

package org.mydotey.codec.benchmark.data.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FixedData extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FixedData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte fByte() { return bb.get(bb_pos + 0); }
  public short fShort() { return bb.getShort(bb_pos + 2); }
  public int fInt() { return bb.getInt(bb_pos + 4); }
  public long fLong() { return bb.getLong(bb_pos + 8); }
  public float fFloat() { return bb.getFloat(bb_pos + 16); }
  public double fDouble() { return bb.getDouble(bb_pos + 24); }
  public boolean fBool() { return 0!=bb.get(bb_pos + 32); }
  public byte fEnum() { return bb.get(bb_pos + 33); }

  public static int createFixedData(FlatBufferBuilder builder, byte fByte, short fShort, int fInt, long fLong, float fFloat, double fDouble, boolean fBool, byte fEnum) {
    builder.prep(8, 40);
    builder.pad(6);
    builder.putByte(fEnum);
    builder.putBoolean(fBool);
    builder.putDouble(fDouble);
    builder.pad(4);
    builder.putFloat(fFloat);
    builder.putLong(fLong);
    builder.putInt(fInt);
    builder.putShort(fShort);
    builder.pad(1);
    builder.putByte(fByte);
    return builder.offset();
  }
}
