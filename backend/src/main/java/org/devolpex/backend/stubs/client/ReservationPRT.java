// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package org.devolpex.backend.stubs.client;

/**
 * Protobuf type {@code ReservationPRT}
 */
public  final class ReservationPRT extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReservationPRT)
    ReservationPRTOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationPRT.newBuilder() to construct.
  private ReservationPRT(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationPRT() {
    dateDebut_ = "";
    dateFin_ = "";
    preferences_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationPRT();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReservationPRT(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dateDebut_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dateFin_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            preferences_ = s;
            break;
          }
          case 50: {
            org.devolpex.backend.stubs.client.ChambrePRT.Builder subBuilder = null;
            if (chambre_ != null) {
              subBuilder = chambre_.toBuilder();
            }
            chambre_ = input.readMessage(org.devolpex.backend.stubs.client.ChambrePRT.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chambre_);
              chambre_ = subBuilder.buildPartial();
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
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_ReservationPRT_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_ReservationPRT_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.devolpex.backend.stubs.client.ReservationPRT.class, org.devolpex.backend.stubs.client.ReservationPRT.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int DATEDEBUT_FIELD_NUMBER = 2;
  private volatile java.lang.Object dateDebut_;
  /**
   * <code>string dateDebut = 2;</code>
   * @return The dateDebut.
   */
  public java.lang.String getDateDebut() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateDebut_ = s;
      return s;
    }
  }
  /**
   * <code>string dateDebut = 2;</code>
   * @return The bytes for dateDebut.
   */
  public com.google.protobuf.ByteString
      getDateDebutBytes() {
    java.lang.Object ref = dateDebut_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateDebut_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEFIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object dateFin_;
  /**
   * <code>string dateFin = 3;</code>
   * @return The dateFin.
   */
  public java.lang.String getDateFin() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateFin_ = s;
      return s;
    }
  }
  /**
   * <code>string dateFin = 3;</code>
   * @return The bytes for dateFin.
   */
  public com.google.protobuf.ByteString
      getDateFinBytes() {
    java.lang.Object ref = dateFin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateFin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFERENCES_FIELD_NUMBER = 4;
  private volatile java.lang.Object preferences_;
  /**
   * <code>string preferences = 4;</code>
   * @return The preferences.
   */
  public java.lang.String getPreferences() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preferences_ = s;
      return s;
    }
  }
  /**
   * <code>string preferences = 4;</code>
   * @return The bytes for preferences.
   */
  public com.google.protobuf.ByteString
      getPreferencesBytes() {
    java.lang.Object ref = preferences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preferences_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHAMBRE_FIELD_NUMBER = 6;
  private org.devolpex.backend.stubs.client.ChambrePRT chambre_;
  /**
   * <code>.ChambrePRT chambre = 6;</code>
   * @return Whether the chambre field is set.
   */
  public boolean hasChambre() {
    return chambre_ != null;
  }
  /**
   * <code>.ChambrePRT chambre = 6;</code>
   * @return The chambre.
   */
  public org.devolpex.backend.stubs.client.ChambrePRT getChambre() {
    return chambre_ == null ? org.devolpex.backend.stubs.client.ChambrePRT.getDefaultInstance() : chambre_;
  }
  /**
   * <code>.ChambrePRT chambre = 6;</code>
   */
  public org.devolpex.backend.stubs.client.ChambrePRTOrBuilder getChambreOrBuilder() {
    return getChambre();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateFin_);
    }
    if (!getPreferencesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, preferences_);
    }
    if (chambre_ != null) {
      output.writeMessage(6, getChambre());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getDateDebutBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateDebut_);
    }
    if (!getDateFinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateFin_);
    }
    if (!getPreferencesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, preferences_);
    }
    if (chambre_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getChambre());
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
    if (!(obj instanceof org.devolpex.backend.stubs.client.ReservationPRT)) {
      return super.equals(obj);
    }
    org.devolpex.backend.stubs.client.ReservationPRT other = (org.devolpex.backend.stubs.client.ReservationPRT) obj;

    if (getId()
        != other.getId()) return false;
    if (!getDateDebut()
        .equals(other.getDateDebut())) return false;
    if (!getDateFin()
        .equals(other.getDateFin())) return false;
    if (!getPreferences()
        .equals(other.getPreferences())) return false;
    if (hasChambre() != other.hasChambre()) return false;
    if (hasChambre()) {
      if (!getChambre()
          .equals(other.getChambre())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + DATEDEBUT_FIELD_NUMBER;
    hash = (53 * hash) + getDateDebut().hashCode();
    hash = (37 * hash) + DATEFIN_FIELD_NUMBER;
    hash = (53 * hash) + getDateFin().hashCode();
    hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
    hash = (53 * hash) + getPreferences().hashCode();
    if (hasChambre()) {
      hash = (37 * hash) + CHAMBRE_FIELD_NUMBER;
      hash = (53 * hash) + getChambre().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.ReservationPRT parseFrom(
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
  public static Builder newBuilder(org.devolpex.backend.stubs.client.ReservationPRT prototype) {
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
   * Protobuf type {@code ReservationPRT}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReservationPRT)
      org.devolpex.backend.stubs.client.ReservationPRTOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_ReservationPRT_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_ReservationPRT_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.devolpex.backend.stubs.client.ReservationPRT.class, org.devolpex.backend.stubs.client.ReservationPRT.Builder.class);
    }

    // Construct using org.devolpex.backend.stubs.client.ReservationPRT.newBuilder()
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
      id_ = 0L;

      dateDebut_ = "";

      dateFin_ = "";

      preferences_ = "";

      if (chambreBuilder_ == null) {
        chambre_ = null;
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_ReservationPRT_descriptor;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.ReservationPRT getDefaultInstanceForType() {
      return org.devolpex.backend.stubs.client.ReservationPRT.getDefaultInstance();
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.ReservationPRT build() {
      org.devolpex.backend.stubs.client.ReservationPRT result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.ReservationPRT buildPartial() {
      org.devolpex.backend.stubs.client.ReservationPRT result = new org.devolpex.backend.stubs.client.ReservationPRT(this);
      result.id_ = id_;
      result.dateDebut_ = dateDebut_;
      result.dateFin_ = dateFin_;
      result.preferences_ = preferences_;
      if (chambreBuilder_ == null) {
        result.chambre_ = chambre_;
      } else {
        result.chambre_ = chambreBuilder_.build();
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
      if (other instanceof org.devolpex.backend.stubs.client.ReservationPRT) {
        return mergeFrom((org.devolpex.backend.stubs.client.ReservationPRT)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.devolpex.backend.stubs.client.ReservationPRT other) {
      if (other == org.devolpex.backend.stubs.client.ReservationPRT.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getDateDebut().isEmpty()) {
        dateDebut_ = other.dateDebut_;
        onChanged();
      }
      if (!other.getDateFin().isEmpty()) {
        dateFin_ = other.dateFin_;
        onChanged();
      }
      if (!other.getPreferences().isEmpty()) {
        preferences_ = other.preferences_;
        onChanged();
      }
      if (other.hasChambre()) {
        mergeChambre(other.getChambre());
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
      org.devolpex.backend.stubs.client.ReservationPRT parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.devolpex.backend.stubs.client.ReservationPRT) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dateDebut_ = "";
    /**
     * <code>string dateDebut = 2;</code>
     * @return The dateDebut.
     */
    public java.lang.String getDateDebut() {
      java.lang.Object ref = dateDebut_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateDebut_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @return The bytes for dateDebut.
     */
    public com.google.protobuf.ByteString
        getDateDebutBytes() {
      java.lang.Object ref = dateDebut_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateDebut_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @param value The dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebut(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateDebut_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateDebut() {
      
      dateDebut_ = getDefaultInstance().getDateDebut();
      onChanged();
      return this;
    }
    /**
     * <code>string dateDebut = 2;</code>
     * @param value The bytes for dateDebut to set.
     * @return This builder for chaining.
     */
    public Builder setDateDebutBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateDebut_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dateFin_ = "";
    /**
     * <code>string dateFin = 3;</code>
     * @return The dateFin.
     */
    public java.lang.String getDateFin() {
      java.lang.Object ref = dateFin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateFin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateFin = 3;</code>
     * @return The bytes for dateFin.
     */
    public com.google.protobuf.ByteString
        getDateFinBytes() {
      java.lang.Object ref = dateFin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateFin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateFin = 3;</code>
     * @param value The dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateFin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateFin() {
      
      dateFin_ = getDefaultInstance().getDateFin();
      onChanged();
      return this;
    }
    /**
     * <code>string dateFin = 3;</code>
     * @param value The bytes for dateFin to set.
     * @return This builder for chaining.
     */
    public Builder setDateFinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateFin_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object preferences_ = "";
    /**
     * <code>string preferences = 4;</code>
     * @return The preferences.
     */
    public java.lang.String getPreferences() {
      java.lang.Object ref = preferences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preferences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string preferences = 4;</code>
     * @return The bytes for preferences.
     */
    public com.google.protobuf.ByteString
        getPreferencesBytes() {
      java.lang.Object ref = preferences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preferences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string preferences = 4;</code>
     * @param value The preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      preferences_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string preferences = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreferences() {
      
      preferences_ = getDefaultInstance().getPreferences();
      onChanged();
      return this;
    }
    /**
     * <code>string preferences = 4;</code>
     * @param value The bytes for preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      preferences_ = value;
      onChanged();
      return this;
    }

    private org.devolpex.backend.stubs.client.ChambrePRT chambre_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.client.ChambrePRT, org.devolpex.backend.stubs.client.ChambrePRT.Builder, org.devolpex.backend.stubs.client.ChambrePRTOrBuilder> chambreBuilder_;
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     * @return Whether the chambre field is set.
     */
    public boolean hasChambre() {
      return chambreBuilder_ != null || chambre_ != null;
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     * @return The chambre.
     */
    public org.devolpex.backend.stubs.client.ChambrePRT getChambre() {
      if (chambreBuilder_ == null) {
        return chambre_ == null ? org.devolpex.backend.stubs.client.ChambrePRT.getDefaultInstance() : chambre_;
      } else {
        return chambreBuilder_.getMessage();
      }
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public Builder setChambre(org.devolpex.backend.stubs.client.ChambrePRT value) {
      if (chambreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambre_ = value;
        onChanged();
      } else {
        chambreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public Builder setChambre(
        org.devolpex.backend.stubs.client.ChambrePRT.Builder builderForValue) {
      if (chambreBuilder_ == null) {
        chambre_ = builderForValue.build();
        onChanged();
      } else {
        chambreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public Builder mergeChambre(org.devolpex.backend.stubs.client.ChambrePRT value) {
      if (chambreBuilder_ == null) {
        if (chambre_ != null) {
          chambre_ =
            org.devolpex.backend.stubs.client.ChambrePRT.newBuilder(chambre_).mergeFrom(value).buildPartial();
        } else {
          chambre_ = value;
        }
        onChanged();
      } else {
        chambreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public Builder clearChambre() {
      if (chambreBuilder_ == null) {
        chambre_ = null;
        onChanged();
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public org.devolpex.backend.stubs.client.ChambrePRT.Builder getChambreBuilder() {
      
      onChanged();
      return getChambreFieldBuilder().getBuilder();
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    public org.devolpex.backend.stubs.client.ChambrePRTOrBuilder getChambreOrBuilder() {
      if (chambreBuilder_ != null) {
        return chambreBuilder_.getMessageOrBuilder();
      } else {
        return chambre_ == null ?
            org.devolpex.backend.stubs.client.ChambrePRT.getDefaultInstance() : chambre_;
      }
    }
    /**
     * <code>.ChambrePRT chambre = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.devolpex.backend.stubs.client.ChambrePRT, org.devolpex.backend.stubs.client.ChambrePRT.Builder, org.devolpex.backend.stubs.client.ChambrePRTOrBuilder> 
        getChambreFieldBuilder() {
      if (chambreBuilder_ == null) {
        chambreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.devolpex.backend.stubs.client.ChambrePRT, org.devolpex.backend.stubs.client.ChambrePRT.Builder, org.devolpex.backend.stubs.client.ChambrePRTOrBuilder>(
                getChambre(),
                getParentForChildren(),
                isClean());
        chambre_ = null;
      }
      return chambreBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ReservationPRT)
  }

  // @@protoc_insertion_point(class_scope:ReservationPRT)
  private static final org.devolpex.backend.stubs.client.ReservationPRT DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.devolpex.backend.stubs.client.ReservationPRT();
  }

  public static org.devolpex.backend.stubs.client.ReservationPRT getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationPRT>
      PARSER = new com.google.protobuf.AbstractParser<ReservationPRT>() {
    @java.lang.Override
    public ReservationPRT parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReservationPRT(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReservationPRT> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationPRT> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.devolpex.backend.stubs.client.ReservationPRT getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

