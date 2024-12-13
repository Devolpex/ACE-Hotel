// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package org.devolpex.backend.stubs.client;

/**
 * <pre>
 * Create client
 * </pre>
 *
 * Protobuf type {@code CreateClientREQ}
 */
public  final class CreateClientREQ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateClientREQ)
    CreateClientREQOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClientREQ.newBuilder() to construct.
  private CreateClientREQ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClientREQ() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClientREQ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateClientREQ(
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
            org.devolpex.backend.stubs.client.ClientRequestPRT.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(org.devolpex.backend.stubs.client.ClientRequestPRT.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
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
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_CreateClientREQ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_CreateClientREQ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.devolpex.backend.stubs.client.CreateClientREQ.class, org.devolpex.backend.stubs.client.CreateClientREQ.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private org.devolpex.backend.stubs.client.ClientRequestPRT client_;
  /**
   * <code>.ClientRequestPRT client = 1;</code>
   * @return Whether the client field is set.
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.ClientRequestPRT client = 1;</code>
   * @return The client.
   */
  public org.devolpex.backend.stubs.client.ClientRequestPRT getClient() {
    return client_ == null ? org.devolpex.backend.stubs.client.ClientRequestPRT.getDefaultInstance() : client_;
  }
  /**
   * <code>.ClientRequestPRT client = 1;</code>
   */
  public org.devolpex.backend.stubs.client.ClientRequestPRTOrBuilder getClientOrBuilder() {
    return getClient();
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
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
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
    if (!(obj instanceof org.devolpex.backend.stubs.client.CreateClientREQ)) {
      return super.equals(obj);
    }
    org.devolpex.backend.stubs.client.CreateClientREQ other = (org.devolpex.backend.stubs.client.CreateClientREQ) obj;

    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
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
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.CreateClientREQ parseFrom(
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
  public static Builder newBuilder(org.devolpex.backend.stubs.client.CreateClientREQ prototype) {
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
   * <pre>
   * Create client
   * </pre>
   *
   * Protobuf type {@code CreateClientREQ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateClientREQ)
      org.devolpex.backend.stubs.client.CreateClientREQOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_CreateClientREQ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_CreateClientREQ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.devolpex.backend.stubs.client.CreateClientREQ.class, org.devolpex.backend.stubs.client.CreateClientREQ.Builder.class);
    }

    // Construct using org.devolpex.backend.stubs.client.CreateClientREQ.newBuilder()
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
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_CreateClientREQ_descriptor;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.CreateClientREQ getDefaultInstanceForType() {
      return org.devolpex.backend.stubs.client.CreateClientREQ.getDefaultInstance();
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.CreateClientREQ build() {
      org.devolpex.backend.stubs.client.CreateClientREQ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.CreateClientREQ buildPartial() {
      org.devolpex.backend.stubs.client.CreateClientREQ result = new org.devolpex.backend.stubs.client.CreateClientREQ(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
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
      if (other instanceof org.devolpex.backend.stubs.client.CreateClientREQ) {
        return mergeFrom((org.devolpex.backend.stubs.client.CreateClientREQ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.devolpex.backend.stubs.client.CreateClientREQ other) {
      if (other == org.devolpex.backend.stubs.client.CreateClientREQ.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
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
      org.devolpex.backend.stubs.client.CreateClientREQ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.devolpex.backend.stubs.client.CreateClientREQ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.devolpex.backend.stubs.client.ClientRequestPRT client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.client.ClientRequestPRT, org.devolpex.backend.stubs.client.ClientRequestPRT.Builder, org.devolpex.backend.stubs.client.ClientRequestPRTOrBuilder> clientBuilder_;
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     * @return The client.
     */
    public org.devolpex.backend.stubs.client.ClientRequestPRT getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? org.devolpex.backend.stubs.client.ClientRequestPRT.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public Builder setClient(org.devolpex.backend.stubs.client.ClientRequestPRT value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public Builder setClient(
        org.devolpex.backend.stubs.client.ClientRequestPRT.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public Builder mergeClient(org.devolpex.backend.stubs.client.ClientRequestPRT value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            org.devolpex.backend.stubs.client.ClientRequestPRT.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public org.devolpex.backend.stubs.client.ClientRequestPRT.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    public org.devolpex.backend.stubs.client.ClientRequestPRTOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            org.devolpex.backend.stubs.client.ClientRequestPRT.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.ClientRequestPRT client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.client.ClientRequestPRT, org.devolpex.backend.stubs.client.ClientRequestPRT.Builder, org.devolpex.backend.stubs.client.ClientRequestPRTOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.devolpex.backend.stubs.client.ClientRequestPRT, org.devolpex.backend.stubs.client.ClientRequestPRT.Builder, org.devolpex.backend.stubs.client.ClientRequestPRTOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CreateClientREQ)
  }

  // @@protoc_insertion_point(class_scope:CreateClientREQ)
  private static final org.devolpex.backend.stubs.client.CreateClientREQ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.devolpex.backend.stubs.client.CreateClientREQ();
  }

  public static org.devolpex.backend.stubs.client.CreateClientREQ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClientREQ>
      PARSER = new com.google.protobuf.AbstractParser<CreateClientREQ>() {
    @java.lang.Override
    public CreateClientREQ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateClientREQ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateClientREQ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClientREQ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.devolpex.backend.stubs.client.CreateClientREQ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

