// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package org.devolpex.backend.stubs.reservation;

/**
 * Protobuf type {@code GetReservationPageRES}
 */
public  final class GetReservationPageRES extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetReservationPageRES)
    GetReservationPageRESOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetReservationPageRES.newBuilder() to construct.
  private GetReservationPageRES(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetReservationPageRES() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetReservationPageRES();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetReservationPageRES(
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
            org.devolpex.backend.stubs.reservation.ReservationPage.Builder subBuilder = null;
            if (reservationPage_ != null) {
              subBuilder = reservationPage_.toBuilder();
            }
            reservationPage_ = input.readMessage(org.devolpex.backend.stubs.reservation.ReservationPage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reservationPage_);
              reservationPage_ = subBuilder.buildPartial();
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
    return org.devolpex.backend.stubs.reservation.ReservationOuterClass.internal_static_GetReservationPageRES_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.devolpex.backend.stubs.reservation.ReservationOuterClass.internal_static_GetReservationPageRES_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.devolpex.backend.stubs.reservation.GetReservationPageRES.class, org.devolpex.backend.stubs.reservation.GetReservationPageRES.Builder.class);
  }

  public static final int RESERVATIONPAGE_FIELD_NUMBER = 1;
  private org.devolpex.backend.stubs.reservation.ReservationPage reservationPage_;
  /**
   * <code>.ReservationPage reservationPage = 1;</code>
   * @return Whether the reservationPage field is set.
   */
  public boolean hasReservationPage() {
    return reservationPage_ != null;
  }
  /**
   * <code>.ReservationPage reservationPage = 1;</code>
   * @return The reservationPage.
   */
  public org.devolpex.backend.stubs.reservation.ReservationPage getReservationPage() {
    return reservationPage_ == null ? org.devolpex.backend.stubs.reservation.ReservationPage.getDefaultInstance() : reservationPage_;
  }
  /**
   * <code>.ReservationPage reservationPage = 1;</code>
   */
  public org.devolpex.backend.stubs.reservation.ReservationPageOrBuilder getReservationPageOrBuilder() {
    return getReservationPage();
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
    if (reservationPage_ != null) {
      output.writeMessage(1, getReservationPage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reservationPage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReservationPage());
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
    if (!(obj instanceof org.devolpex.backend.stubs.reservation.GetReservationPageRES)) {
      return super.equals(obj);
    }
    org.devolpex.backend.stubs.reservation.GetReservationPageRES other = (org.devolpex.backend.stubs.reservation.GetReservationPageRES) obj;

    if (hasReservationPage() != other.hasReservationPage()) return false;
    if (hasReservationPage()) {
      if (!getReservationPage()
          .equals(other.getReservationPage())) return false;
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
    if (hasReservationPage()) {
      hash = (37 * hash) + RESERVATIONPAGE_FIELD_NUMBER;
      hash = (53 * hash) + getReservationPage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES parseFrom(
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
  public static Builder newBuilder(org.devolpex.backend.stubs.reservation.GetReservationPageRES prototype) {
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
   * Protobuf type {@code GetReservationPageRES}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetReservationPageRES)
      org.devolpex.backend.stubs.reservation.GetReservationPageRESOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.devolpex.backend.stubs.reservation.ReservationOuterClass.internal_static_GetReservationPageRES_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.devolpex.backend.stubs.reservation.ReservationOuterClass.internal_static_GetReservationPageRES_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.devolpex.backend.stubs.reservation.GetReservationPageRES.class, org.devolpex.backend.stubs.reservation.GetReservationPageRES.Builder.class);
    }

    // Construct using org.devolpex.backend.stubs.reservation.GetReservationPageRES.newBuilder()
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
      if (reservationPageBuilder_ == null) {
        reservationPage_ = null;
      } else {
        reservationPage_ = null;
        reservationPageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.devolpex.backend.stubs.reservation.ReservationOuterClass.internal_static_GetReservationPageRES_descriptor;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.reservation.GetReservationPageRES getDefaultInstanceForType() {
      return org.devolpex.backend.stubs.reservation.GetReservationPageRES.getDefaultInstance();
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.reservation.GetReservationPageRES build() {
      org.devolpex.backend.stubs.reservation.GetReservationPageRES result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.reservation.GetReservationPageRES buildPartial() {
      org.devolpex.backend.stubs.reservation.GetReservationPageRES result = new org.devolpex.backend.stubs.reservation.GetReservationPageRES(this);
      if (reservationPageBuilder_ == null) {
        result.reservationPage_ = reservationPage_;
      } else {
        result.reservationPage_ = reservationPageBuilder_.build();
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
      if (other instanceof org.devolpex.backend.stubs.reservation.GetReservationPageRES) {
        return mergeFrom((org.devolpex.backend.stubs.reservation.GetReservationPageRES)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.devolpex.backend.stubs.reservation.GetReservationPageRES other) {
      if (other == org.devolpex.backend.stubs.reservation.GetReservationPageRES.getDefaultInstance()) return this;
      if (other.hasReservationPage()) {
        mergeReservationPage(other.getReservationPage());
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
      org.devolpex.backend.stubs.reservation.GetReservationPageRES parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.devolpex.backend.stubs.reservation.GetReservationPageRES) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.devolpex.backend.stubs.reservation.ReservationPage reservationPage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.reservation.ReservationPage, org.devolpex.backend.stubs.reservation.ReservationPage.Builder, org.devolpex.backend.stubs.reservation.ReservationPageOrBuilder> reservationPageBuilder_;
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     * @return Whether the reservationPage field is set.
     */
    public boolean hasReservationPage() {
      return reservationPageBuilder_ != null || reservationPage_ != null;
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     * @return The reservationPage.
     */
    public org.devolpex.backend.stubs.reservation.ReservationPage getReservationPage() {
      if (reservationPageBuilder_ == null) {
        return reservationPage_ == null ? org.devolpex.backend.stubs.reservation.ReservationPage.getDefaultInstance() : reservationPage_;
      } else {
        return reservationPageBuilder_.getMessage();
      }
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public Builder setReservationPage(org.devolpex.backend.stubs.reservation.ReservationPage value) {
      if (reservationPageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reservationPage_ = value;
        onChanged();
      } else {
        reservationPageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public Builder setReservationPage(
        org.devolpex.backend.stubs.reservation.ReservationPage.Builder builderForValue) {
      if (reservationPageBuilder_ == null) {
        reservationPage_ = builderForValue.build();
        onChanged();
      } else {
        reservationPageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public Builder mergeReservationPage(org.devolpex.backend.stubs.reservation.ReservationPage value) {
      if (reservationPageBuilder_ == null) {
        if (reservationPage_ != null) {
          reservationPage_ =
            org.devolpex.backend.stubs.reservation.ReservationPage.newBuilder(reservationPage_).mergeFrom(value).buildPartial();
        } else {
          reservationPage_ = value;
        }
        onChanged();
      } else {
        reservationPageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public Builder clearReservationPage() {
      if (reservationPageBuilder_ == null) {
        reservationPage_ = null;
        onChanged();
      } else {
        reservationPage_ = null;
        reservationPageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public org.devolpex.backend.stubs.reservation.ReservationPage.Builder getReservationPageBuilder() {
      
      onChanged();
      return getReservationPageFieldBuilder().getBuilder();
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    public org.devolpex.backend.stubs.reservation.ReservationPageOrBuilder getReservationPageOrBuilder() {
      if (reservationPageBuilder_ != null) {
        return reservationPageBuilder_.getMessageOrBuilder();
      } else {
        return reservationPage_ == null ?
            org.devolpex.backend.stubs.reservation.ReservationPage.getDefaultInstance() : reservationPage_;
      }
    }
    /**
     * <code>.ReservationPage reservationPage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.reservation.ReservationPage, org.devolpex.backend.stubs.reservation.ReservationPage.Builder, org.devolpex.backend.stubs.reservation.ReservationPageOrBuilder> 
        getReservationPageFieldBuilder() {
      if (reservationPageBuilder_ == null) {
        reservationPageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.devolpex.backend.stubs.reservation.ReservationPage, org.devolpex.backend.stubs.reservation.ReservationPage.Builder, org.devolpex.backend.stubs.reservation.ReservationPageOrBuilder>(
                getReservationPage(),
                getParentForChildren(),
                isClean());
        reservationPage_ = null;
      }
      return reservationPageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetReservationPageRES)
  }

  // @@protoc_insertion_point(class_scope:GetReservationPageRES)
  private static final org.devolpex.backend.stubs.reservation.GetReservationPageRES DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.devolpex.backend.stubs.reservation.GetReservationPageRES();
  }

  public static org.devolpex.backend.stubs.reservation.GetReservationPageRES getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetReservationPageRES>
      PARSER = new com.google.protobuf.AbstractParser<GetReservationPageRES>() {
    @java.lang.Override
    public GetReservationPageRES parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetReservationPageRES(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetReservationPageRES> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetReservationPageRES> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.devolpex.backend.stubs.reservation.GetReservationPageRES getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

