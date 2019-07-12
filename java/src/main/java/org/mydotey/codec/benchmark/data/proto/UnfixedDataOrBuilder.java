// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: primitives.proto

package org.mydotey.codec.benchmark.data.proto;

public interface UnfixedDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.mydotey.codec.benchmark.data.proto.UnfixedData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 fByte = 1;</code>
   */
  int getFByte();

  /**
   * <code>sint32 fShort = 2;</code>
   */
  int getFShort();

  /**
   * <code>sint32 fInt = 3;</code>
   */
  int getFInt();

  /**
   * <code>sint64 fLong = 4;</code>
   */
  long getFLong();

  /**
   * <code>float fFloat = 5;</code>
   */
  float getFFloat();

  /**
   * <code>double fDouble = 6;</code>
   */
  double getFDouble();

  /**
   * <code>bool fBool = 7;</code>
   */
  boolean getFBool();

  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.PEnum fEnum = 8;</code>
   */
  int getFEnumValue();
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.PEnum fEnum = 8;</code>
   */
  org.mydotey.codec.benchmark.data.proto.PEnum getFEnum();

  /**
   * <code>string fString = 9;</code>
   */
  java.lang.String getFString();
  /**
   * <code>string fString = 9;</code>
   */
  com.google.protobuf.ByteString
      getFStringBytes();

  /**
   * <code>bytes fListByte = 10;</code>
   */
  com.google.protobuf.ByteString getFListByte();

  /**
   * <code>repeated sint32 fListInt = 11;</code>
   */
  java.util.List<java.lang.Integer> getFListIntList();
  /**
   * <code>repeated sint32 fListInt = 11;</code>
   */
  int getFListIntCount();
  /**
   * <code>repeated sint32 fListInt = 11;</code>
   */
  int getFListInt(int index);

  /**
   * <code>repeated bool fListBool = 12;</code>
   */
  java.util.List<java.lang.Boolean> getFListBoolList();
  /**
   * <code>repeated bool fListBool = 12;</code>
   */
  int getFListBoolCount();
  /**
   * <code>repeated bool fListBool = 12;</code>
   */
  boolean getFListBool(int index);

  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.PEnum fListEnum = 13;</code>
   */
  java.util.List<org.mydotey.codec.benchmark.data.proto.PEnum> getFListEnumList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.PEnum fListEnum = 13;</code>
   */
  int getFListEnumCount();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.PEnum fListEnum = 13;</code>
   */
  org.mydotey.codec.benchmark.data.proto.PEnum getFListEnum(int index);
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.PEnum fListEnum = 13;</code>
   */
  java.util.List<java.lang.Integer>
  getFListEnumValueList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.PEnum fListEnum = 13;</code>
   */
  int getFListEnumValue(int index);

  /**
   * <code>repeated string fListString = 14;</code>
   */
  java.util.List<java.lang.String>
      getFListStringList();
  /**
   * <code>repeated string fListString = 14;</code>
   */
  int getFListStringCount();
  /**
   * <code>repeated string fListString = 14;</code>
   */
  java.lang.String getFListString(int index);
  /**
   * <code>repeated string fListString = 14;</code>
   */
  com.google.protobuf.ByteString
      getFListStringBytes(int index);

  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.FixedData fListFixed = 15;</code>
   */
  java.util.List<org.mydotey.codec.benchmark.data.proto.FixedData> 
      getFListFixedList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.FixedData fListFixed = 15;</code>
   */
  org.mydotey.codec.benchmark.data.proto.FixedData getFListFixed(int index);
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.FixedData fListFixed = 15;</code>
   */
  int getFListFixedCount();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.FixedData fListFixed = 15;</code>
   */
  java.util.List<? extends org.mydotey.codec.benchmark.data.proto.FixedDataOrBuilder> 
      getFListFixedOrBuilderList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.FixedData fListFixed = 15;</code>
   */
  org.mydotey.codec.benchmark.data.proto.FixedDataOrBuilder getFListFixedOrBuilder(
      int index);

  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.UnfixedData fListUnfixed = 16;</code>
   */
  java.util.List<org.mydotey.codec.benchmark.data.proto.UnfixedData> 
      getFListUnfixedList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.UnfixedData fListUnfixed = 16;</code>
   */
  org.mydotey.codec.benchmark.data.proto.UnfixedData getFListUnfixed(int index);
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.UnfixedData fListUnfixed = 16;</code>
   */
  int getFListUnfixedCount();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.UnfixedData fListUnfixed = 16;</code>
   */
  java.util.List<? extends org.mydotey.codec.benchmark.data.proto.UnfixedDataOrBuilder> 
      getFListUnfixedOrBuilderList();
  /**
   * <code>repeated .org.mydotey.codec.benchmark.data.proto.UnfixedData fListUnfixed = 16;</code>
   */
  org.mydotey.codec.benchmark.data.proto.UnfixedDataOrBuilder getFListUnfixedOrBuilder(
      int index);
}
