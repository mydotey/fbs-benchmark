// automatically generated by the FlatBuffers compiler, do not modify

package org.mydotey.codec.benchmark.data.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MultiListUnfixedData extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_11_1(); }
  public static MultiListUnfixedData getRootAsMultiListUnfixedData(ByteBuffer _bb) { return getRootAsMultiListUnfixedData(_bb, new MultiListUnfixedData()); }
  public static MultiListUnfixedData getRootAsMultiListUnfixedData(ByteBuffer _bb, MultiListUnfixedData obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MultiListUnfixedData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList1(int j) { return fList1(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList1(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList1Length() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList2(int j) { return fList2(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList2(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList2Length() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList3(int j) { return fList3(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList3(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList3Length() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList4(int j) { return fList4(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList4(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList4Length() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList5(int j) { return fList5(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList5(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList5Length() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList6(int j) { return fList6(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList6(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList6Length() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList7(int j) { return fList7(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList7(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList7Length() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList8(int j) { return fList8(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList8(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList8Length() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList9(int j) { return fList9(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList9(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(20); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList9Length() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList10(int j) { return fList10(new org.mydotey.codec.benchmark.data.fbs.UnfixedData(), j); }
  public org.mydotey.codec.benchmark.data.fbs.UnfixedData fList10(org.mydotey.codec.benchmark.data.fbs.UnfixedData obj, int j) { int o = __offset(22); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fList10Length() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }

  public static int createMultiListUnfixedData(FlatBufferBuilder builder,
      int fList1Offset,
      int fList2Offset,
      int fList3Offset,
      int fList4Offset,
      int fList5Offset,
      int fList6Offset,
      int fList7Offset,
      int fList8Offset,
      int fList9Offset,
      int fList10Offset) {
    builder.startTable(10);
    MultiListUnfixedData.addFList10(builder, fList10Offset);
    MultiListUnfixedData.addFList9(builder, fList9Offset);
    MultiListUnfixedData.addFList8(builder, fList8Offset);
    MultiListUnfixedData.addFList7(builder, fList7Offset);
    MultiListUnfixedData.addFList6(builder, fList6Offset);
    MultiListUnfixedData.addFList5(builder, fList5Offset);
    MultiListUnfixedData.addFList4(builder, fList4Offset);
    MultiListUnfixedData.addFList3(builder, fList3Offset);
    MultiListUnfixedData.addFList2(builder, fList2Offset);
    MultiListUnfixedData.addFList1(builder, fList1Offset);
    return MultiListUnfixedData.endMultiListUnfixedData(builder);
  }

  public static void startMultiListUnfixedData(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addFList1(FlatBufferBuilder builder, int fList1Offset) { builder.addOffset(0, fList1Offset, 0); }
  public static int createFList1Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList1Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList2(FlatBufferBuilder builder, int fList2Offset) { builder.addOffset(1, fList2Offset, 0); }
  public static int createFList2Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList2Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList3(FlatBufferBuilder builder, int fList3Offset) { builder.addOffset(2, fList3Offset, 0); }
  public static int createFList3Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList3Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList4(FlatBufferBuilder builder, int fList4Offset) { builder.addOffset(3, fList4Offset, 0); }
  public static int createFList4Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList4Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList5(FlatBufferBuilder builder, int fList5Offset) { builder.addOffset(4, fList5Offset, 0); }
  public static int createFList5Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList5Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList6(FlatBufferBuilder builder, int fList6Offset) { builder.addOffset(5, fList6Offset, 0); }
  public static int createFList6Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList6Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList7(FlatBufferBuilder builder, int fList7Offset) { builder.addOffset(6, fList7Offset, 0); }
  public static int createFList7Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList7Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList8(FlatBufferBuilder builder, int fList8Offset) { builder.addOffset(7, fList8Offset, 0); }
  public static int createFList8Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList8Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList9(FlatBufferBuilder builder, int fList9Offset) { builder.addOffset(8, fList9Offset, 0); }
  public static int createFList9Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList9Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFList10(FlatBufferBuilder builder, int fList10Offset) { builder.addOffset(9, fList10Offset, 0); }
  public static int createFList10Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFList10Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMultiListUnfixedData(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
}
