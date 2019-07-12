// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compound.proto

package org.mydotey.codec.benchmark.data.proto;

/**
 * Protobuf type {@code org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData}
 */
public  final class NestedMultiListFixedData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)
    NestedMultiListFixedDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NestedMultiListFixedData.newBuilder() to construct.
  private NestedMultiListFixedData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NestedMultiListFixedData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NestedMultiListFixedData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NestedMultiListFixedData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder subBuilder = null;
            if (fMultiList_ != null) {
              subBuilder = fMultiList_.toBuilder();
            }
            fMultiList_ = input.readMessage(org.mydotey.codec.benchmark.data.proto.MultiListFixedData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fMultiList_);
              fMultiList_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder subBuilder = null;
            if (fNested_ != null) {
              subBuilder = fNested_.toBuilder();
            }
            fNested_ = input.readMessage(org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fNested_);
              fNested_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mydotey.codec.benchmark.data.proto.Compound.internal_static_org_mydotey_codec_benchmark_data_proto_NestedMultiListFixedData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mydotey.codec.benchmark.data.proto.Compound.internal_static_org_mydotey_codec_benchmark_data_proto_NestedMultiListFixedData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.class, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder.class);
  }

  public static final int FMULTILIST_FIELD_NUMBER = 1;
  private org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList_;
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
   */
  public boolean hasFMultiList() {
    return fMultiList_ != null;
  }
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
   */
  public org.mydotey.codec.benchmark.data.proto.MultiListFixedData getFMultiList() {
    return fMultiList_ == null ? org.mydotey.codec.benchmark.data.proto.MultiListFixedData.getDefaultInstance() : fMultiList_;
  }
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
   */
  public org.mydotey.codec.benchmark.data.proto.MultiListFixedDataOrBuilder getFMultiListOrBuilder() {
    return getFMultiList();
  }

  public static final int FNESTED_FIELD_NUMBER = 2;
  private org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested_;
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
   */
  public boolean hasFNested() {
    return fNested_ != null;
  }
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
   */
  public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData getFNested() {
    return fNested_ == null ? org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.getDefaultInstance() : fNested_;
  }
  /**
   * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
   */
  public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder getFNestedOrBuilder() {
    return getFNested();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fMultiList_ != null) {
      output.writeMessage(1, getFMultiList());
    }
    if (fNested_ != null) {
      output.writeMessage(2, getFNested());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fMultiList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFMultiList());
    }
    if (fNested_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFNested());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)) {
      return super.equals(obj);
    }
    org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData other = (org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData) obj;

    if (hasFMultiList() != other.hasFMultiList()) return false;
    if (hasFMultiList()) {
      if (!getFMultiList()
          .equals(other.getFMultiList())) return false;
    }
    if (hasFNested() != other.hasFNested()) return false;
    if (hasFNested()) {
      if (!getFNested()
          .equals(other.getFNested())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFMultiList()) {
      hash = (37 * hash) + FMULTILIST_FIELD_NUMBER;
      hash = (53 * hash) + getFMultiList().hashCode();
    }
    if (hasFNested()) {
      hash = (37 * hash) + FNESTED_FIELD_NUMBER;
      hash = (53 * hash) + getFNested().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)
      org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mydotey.codec.benchmark.data.proto.Compound.internal_static_org_mydotey_codec_benchmark_data_proto_NestedMultiListFixedData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mydotey.codec.benchmark.data.proto.Compound.internal_static_org_mydotey_codec_benchmark_data_proto_NestedMultiListFixedData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.class, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder.class);
    }

    // Construct using org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fMultiListBuilder_ == null) {
        fMultiList_ = null;
      } else {
        fMultiList_ = null;
        fMultiListBuilder_ = null;
      }
      if (fNestedBuilder_ == null) {
        fNested_ = null;
      } else {
        fNested_ = null;
        fNestedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mydotey.codec.benchmark.data.proto.Compound.internal_static_org_mydotey_codec_benchmark_data_proto_NestedMultiListFixedData_descriptor;
    }

    @java.lang.Override
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData getDefaultInstanceForType() {
      return org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.getDefaultInstance();
    }

    @java.lang.Override
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData build() {
      org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData buildPartial() {
      org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData result = new org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData(this);
      if (fMultiListBuilder_ == null) {
        result.fMultiList_ = fMultiList_;
      } else {
        result.fMultiList_ = fMultiListBuilder_.build();
      }
      if (fNestedBuilder_ == null) {
        result.fNested_ = fNested_;
      } else {
        result.fNested_ = fNestedBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData) {
        return mergeFrom((org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData other) {
      if (other == org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.getDefaultInstance()) return this;
      if (other.hasFMultiList()) {
        mergeFMultiList(other.getFMultiList());
      }
      if (other.hasFNested()) {
        mergeFNested(other.getFNested());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mydotey.codec.benchmark.data.proto.MultiListFixedData, org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.MultiListFixedDataOrBuilder> fMultiListBuilder_;
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public boolean hasFMultiList() {
      return fMultiListBuilder_ != null || fMultiList_ != null;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.MultiListFixedData getFMultiList() {
      if (fMultiListBuilder_ == null) {
        return fMultiList_ == null ? org.mydotey.codec.benchmark.data.proto.MultiListFixedData.getDefaultInstance() : fMultiList_;
      } else {
        return fMultiListBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public Builder setFMultiList(org.mydotey.codec.benchmark.data.proto.MultiListFixedData value) {
      if (fMultiListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fMultiList_ = value;
        onChanged();
      } else {
        fMultiListBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public Builder setFMultiList(
        org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder builderForValue) {
      if (fMultiListBuilder_ == null) {
        fMultiList_ = builderForValue.build();
        onChanged();
      } else {
        fMultiListBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public Builder mergeFMultiList(org.mydotey.codec.benchmark.data.proto.MultiListFixedData value) {
      if (fMultiListBuilder_ == null) {
        if (fMultiList_ != null) {
          fMultiList_ =
            org.mydotey.codec.benchmark.data.proto.MultiListFixedData.newBuilder(fMultiList_).mergeFrom(value).buildPartial();
        } else {
          fMultiList_ = value;
        }
        onChanged();
      } else {
        fMultiListBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public Builder clearFMultiList() {
      if (fMultiListBuilder_ == null) {
        fMultiList_ = null;
        onChanged();
      } else {
        fMultiList_ = null;
        fMultiListBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder getFMultiListBuilder() {
      
      onChanged();
      return getFMultiListFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.MultiListFixedDataOrBuilder getFMultiListOrBuilder() {
      if (fMultiListBuilder_ != null) {
        return fMultiListBuilder_.getMessageOrBuilder();
      } else {
        return fMultiList_ == null ?
            org.mydotey.codec.benchmark.data.proto.MultiListFixedData.getDefaultInstance() : fMultiList_;
      }
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.MultiListFixedData fMultiList = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mydotey.codec.benchmark.data.proto.MultiListFixedData, org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.MultiListFixedDataOrBuilder> 
        getFMultiListFieldBuilder() {
      if (fMultiListBuilder_ == null) {
        fMultiListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mydotey.codec.benchmark.data.proto.MultiListFixedData, org.mydotey.codec.benchmark.data.proto.MultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.MultiListFixedDataOrBuilder>(
                getFMultiList(),
                getParentForChildren(),
                isClean());
        fMultiList_ = null;
      }
      return fMultiListBuilder_;
    }

    private org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder> fNestedBuilder_;
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public boolean hasFNested() {
      return fNestedBuilder_ != null || fNested_ != null;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData getFNested() {
      if (fNestedBuilder_ == null) {
        return fNested_ == null ? org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.getDefaultInstance() : fNested_;
      } else {
        return fNestedBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public Builder setFNested(org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData value) {
      if (fNestedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fNested_ = value;
        onChanged();
      } else {
        fNestedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public Builder setFNested(
        org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder builderForValue) {
      if (fNestedBuilder_ == null) {
        fNested_ = builderForValue.build();
        onChanged();
      } else {
        fNestedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public Builder mergeFNested(org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData value) {
      if (fNestedBuilder_ == null) {
        if (fNested_ != null) {
          fNested_ =
            org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.newBuilder(fNested_).mergeFrom(value).buildPartial();
        } else {
          fNested_ = value;
        }
        onChanged();
      } else {
        fNestedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public Builder clearFNested() {
      if (fNestedBuilder_ == null) {
        fNested_ = null;
        onChanged();
      } else {
        fNested_ = null;
        fNestedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder getFNestedBuilder() {
      
      onChanged();
      return getFNestedFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder getFNestedOrBuilder() {
      if (fNestedBuilder_ != null) {
        return fNestedBuilder_.getMessageOrBuilder();
      } else {
        return fNested_ == null ?
            org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.getDefaultInstance() : fNested_;
      }
    }
    /**
     * <code>.org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData fNested = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder> 
        getFNestedFieldBuilder() {
      if (fNestedBuilder_ == null) {
        fNestedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData.Builder, org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedDataOrBuilder>(
                getFNested(),
                getParentForChildren(),
                isClean());
        fNested_ = null;
      }
      return fNestedBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)
  }

  // @@protoc_insertion_point(class_scope:org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData)
  private static final org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData();
  }

  public static org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NestedMultiListFixedData>
      PARSER = new com.google.protobuf.AbstractParser<NestedMultiListFixedData>() {
    @java.lang.Override
    public NestedMultiListFixedData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NestedMultiListFixedData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NestedMultiListFixedData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NestedMultiListFixedData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mydotey.codec.benchmark.data.proto.NestedMultiListFixedData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

