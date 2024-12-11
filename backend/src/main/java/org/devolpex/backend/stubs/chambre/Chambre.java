// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chambre.proto

package org.devolpex.backend.stubs.chambre;

/**
 * <pre>
 * Message for a Chambre
 * </pre>
 *
 * Protobuf type {@code Chambre}
 */
public  final class Chambre extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Chambre)
    ChambreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Chambre.newBuilder() to construct.
  private Chambre(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Chambre() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Chambre();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Chambre(
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

            type_ = s;
            break;
          }
          case 29: {

            prix_ = input.readFloat();
            break;
          }
          case 32: {

            disponible_ = input.readBool();
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
    return org.devolpex.backend.stubs.chambre.ChambreOuterClass.internal_static_Chambre_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.devolpex.backend.stubs.chambre.ChambreOuterClass.internal_static_Chambre_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.devolpex.backend.stubs.chambre.Chambre.class, org.devolpex.backend.stubs.chambre.Chambre.Builder.class);
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

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIX_FIELD_NUMBER = 3;
  private float prix_;
  /**
   * <code>float prix = 3;</code>
   * @return The prix.
   */
  public float getPrix() {
    return prix_;
  }

  public static final int DISPONIBLE_FIELD_NUMBER = 4;
  private boolean disponible_;
  /**
   * <code>bool disponible = 4;</code>
   * @return The disponible.
   */
  public boolean getDisponible() {
    return disponible_;
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (prix_ != 0F) {
      output.writeFloat(3, prix_);
    }
    if (disponible_ != false) {
      output.writeBool(4, disponible_);
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
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (prix_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, prix_);
    }
    if (disponible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disponible_);
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
    if (!(obj instanceof org.devolpex.backend.stubs.chambre.Chambre)) {
      return super.equals(obj);
    }
    org.devolpex.backend.stubs.chambre.Chambre other = (org.devolpex.backend.stubs.chambre.Chambre) obj;

    if (getId()
        != other.getId()) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (java.lang.Float.floatToIntBits(getPrix())
        != java.lang.Float.floatToIntBits(
            other.getPrix())) return false;
    if (getDisponible()
        != other.getDisponible()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + PRIX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPrix());
    hash = (37 * hash) + DISPONIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisponible());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.chambre.Chambre parseFrom(
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
  public static Builder newBuilder(org.devolpex.backend.stubs.chambre.Chambre prototype) {
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
   * Message for a Chambre
   * </pre>
   *
   * Protobuf type {@code Chambre}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Chambre)
      org.devolpex.backend.stubs.chambre.ChambreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.devolpex.backend.stubs.chambre.ChambreOuterClass.internal_static_Chambre_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.devolpex.backend.stubs.chambre.ChambreOuterClass.internal_static_Chambre_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.devolpex.backend.stubs.chambre.Chambre.class, org.devolpex.backend.stubs.chambre.Chambre.Builder.class);
    }

    // Construct using org.devolpex.backend.stubs.chambre.Chambre.newBuilder()
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

      type_ = "";

      prix_ = 0F;

      disponible_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.devolpex.backend.stubs.chambre.ChambreOuterClass.internal_static_Chambre_descriptor;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.chambre.Chambre getDefaultInstanceForType() {
      return org.devolpex.backend.stubs.chambre.Chambre.getDefaultInstance();
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.chambre.Chambre build() {
      org.devolpex.backend.stubs.chambre.Chambre result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.chambre.Chambre buildPartial() {
      org.devolpex.backend.stubs.chambre.Chambre result = new org.devolpex.backend.stubs.chambre.Chambre(this);
      result.id_ = id_;
      result.type_ = type_;
      result.prix_ = prix_;
      result.disponible_ = disponible_;
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
      if (other instanceof org.devolpex.backend.stubs.chambre.Chambre) {
        return mergeFrom((org.devolpex.backend.stubs.chambre.Chambre)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.devolpex.backend.stubs.chambre.Chambre other) {
      if (other == org.devolpex.backend.stubs.chambre.Chambre.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getPrix() != 0F) {
        setPrix(other.getPrix());
      }
      if (other.getDisponible() != false) {
        setDisponible(other.getDisponible());
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
      org.devolpex.backend.stubs.chambre.Chambre parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.devolpex.backend.stubs.chambre.Chambre) e.getUnfinishedMessage();
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

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private float prix_ ;
    /**
     * <code>float prix = 3;</code>
     * @return The prix.
     */
    public float getPrix() {
      return prix_;
    }
    /**
     * <code>float prix = 3;</code>
     * @param value The prix to set.
     * @return This builder for chaining.
     */
    public Builder setPrix(float value) {
      
      prix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float prix = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrix() {
      
      prix_ = 0F;
      onChanged();
      return this;
    }

    private boolean disponible_ ;
    /**
     * <code>bool disponible = 4;</code>
     * @return The disponible.
     */
    public boolean getDisponible() {
      return disponible_;
    }
    /**
     * <code>bool disponible = 4;</code>
     * @param value The disponible to set.
     * @return This builder for chaining.
     */
    public Builder setDisponible(boolean value) {
      
      disponible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool disponible = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisponible() {
      
      disponible_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Chambre)
  }

  // @@protoc_insertion_point(class_scope:Chambre)
  private static final org.devolpex.backend.stubs.chambre.Chambre DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.devolpex.backend.stubs.chambre.Chambre();
  }

  public static org.devolpex.backend.stubs.chambre.Chambre getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Chambre>
      PARSER = new com.google.protobuf.AbstractParser<Chambre>() {
    @java.lang.Override
    public Chambre parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Chambre(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Chambre> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Chambre> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.devolpex.backend.stubs.chambre.Chambre getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

