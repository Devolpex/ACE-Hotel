// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package org.devolpex.backend.stubs.client;

/**
 * <pre>
 * Client Message
 * </pre>
 *
 * Protobuf type {@code Client}
 */
public  final class Client extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Client)
    ClientOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Client.newBuilder() to construct.
  private Client(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Client() {
    nom_ = "";
    prenom_ = "";
    email_ = "";
    telephone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Client();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Client(
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

            nom_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            prenom_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            telephone_ = s;
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
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_Client_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_Client_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.devolpex.backend.stubs.client.Client.class, org.devolpex.backend.stubs.client.Client.Builder.class);
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

  public static final int NOM_FIELD_NUMBER = 2;
  private volatile java.lang.Object nom_;
  /**
   * <code>string nom = 2;</code>
   * @return The nom.
   */
  public java.lang.String getNom() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nom_ = s;
      return s;
    }
  }
  /**
   * <code>string nom = 2;</code>
   * @return The bytes for nom.
   */
  public com.google.protobuf.ByteString
      getNomBytes() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRENOM_FIELD_NUMBER = 3;
  private volatile java.lang.Object prenom_;
  /**
   * <code>string prenom = 3;</code>
   * @return The prenom.
   */
  public java.lang.String getPrenom() {
    java.lang.Object ref = prenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prenom_ = s;
      return s;
    }
  }
  /**
   * <code>string prenom = 3;</code>
   * @return The bytes for prenom.
   */
  public com.google.protobuf.ByteString
      getPrenomBytes() {
    java.lang.Object ref = prenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 4;</code>
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TELEPHONE_FIELD_NUMBER = 5;
  private volatile java.lang.Object telephone_;
  /**
   * <code>string telephone = 5;</code>
   * @return The telephone.
   */
  public java.lang.String getTelephone() {
    java.lang.Object ref = telephone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      telephone_ = s;
      return s;
    }
  }
  /**
   * <code>string telephone = 5;</code>
   * @return The bytes for telephone.
   */
  public com.google.protobuf.ByteString
      getTelephoneBytes() {
    java.lang.Object ref = telephone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      telephone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nom_);
    }
    if (!getPrenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, prenom_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    if (!getTelephoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, telephone_);
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
    if (!getNomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nom_);
    }
    if (!getPrenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, prenom_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    if (!getTelephoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, telephone_);
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
    if (!(obj instanceof org.devolpex.backend.stubs.client.Client)) {
      return super.equals(obj);
    }
    org.devolpex.backend.stubs.client.Client other = (org.devolpex.backend.stubs.client.Client) obj;

    if (getId()
        != other.getId()) return false;
    if (!getNom()
        .equals(other.getNom())) return false;
    if (!getPrenom()
        .equals(other.getPrenom())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getTelephone()
        .equals(other.getTelephone())) return false;
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
    hash = (37 * hash) + NOM_FIELD_NUMBER;
    hash = (53 * hash) + getNom().hashCode();
    hash = (37 * hash) + PRENOM_FIELD_NUMBER;
    hash = (53 * hash) + getPrenom().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + TELEPHONE_FIELD_NUMBER;
    hash = (53 * hash) + getTelephone().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.devolpex.backend.stubs.client.Client parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.Client parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.Client parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.devolpex.backend.stubs.client.Client parseFrom(
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
  public static Builder newBuilder(org.devolpex.backend.stubs.client.Client prototype) {
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
   * Client Message
   * </pre>
   *
   * Protobuf type {@code Client}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Client)
      org.devolpex.backend.stubs.client.ClientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_Client_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_Client_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.devolpex.backend.stubs.client.Client.class, org.devolpex.backend.stubs.client.Client.Builder.class);
    }

    // Construct using org.devolpex.backend.stubs.client.Client.newBuilder()
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

      nom_ = "";

      prenom_ = "";

      email_ = "";

      telephone_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.devolpex.backend.stubs.client.ClientOuterClass.internal_static_Client_descriptor;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.Client getDefaultInstanceForType() {
      return org.devolpex.backend.stubs.client.Client.getDefaultInstance();
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.Client build() {
      org.devolpex.backend.stubs.client.Client result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.devolpex.backend.stubs.client.Client buildPartial() {
      org.devolpex.backend.stubs.client.Client result = new org.devolpex.backend.stubs.client.Client(this);
      result.id_ = id_;
      result.nom_ = nom_;
      result.prenom_ = prenom_;
      result.email_ = email_;
      result.telephone_ = telephone_;
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
      if (other instanceof org.devolpex.backend.stubs.client.Client) {
        return mergeFrom((org.devolpex.backend.stubs.client.Client)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.devolpex.backend.stubs.client.Client other) {
      if (other == org.devolpex.backend.stubs.client.Client.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNom().isEmpty()) {
        nom_ = other.nom_;
        onChanged();
      }
      if (!other.getPrenom().isEmpty()) {
        prenom_ = other.prenom_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getTelephone().isEmpty()) {
        telephone_ = other.telephone_;
        onChanged();
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
      org.devolpex.backend.stubs.client.Client parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.devolpex.backend.stubs.client.Client) e.getUnfinishedMessage();
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

    private java.lang.Object nom_ = "";
    /**
     * <code>string nom = 2;</code>
     * @return The nom.
     */
    public java.lang.String getNom() {
      java.lang.Object ref = nom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nom = 2;</code>
     * @return The bytes for nom.
     */
    public com.google.protobuf.ByteString
        getNomBytes() {
      java.lang.Object ref = nom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nom = 2;</code>
     * @param value The nom to set.
     * @return This builder for chaining.
     */
    public Builder setNom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNom() {
      
      nom_ = getDefaultInstance().getNom();
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 2;</code>
     * @param value The bytes for nom to set.
     * @return This builder for chaining.
     */
    public Builder setNomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object prenom_ = "";
    /**
     * <code>string prenom = 3;</code>
     * @return The prenom.
     */
    public java.lang.String getPrenom() {
      java.lang.Object ref = prenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prenom = 3;</code>
     * @return The bytes for prenom.
     */
    public com.google.protobuf.ByteString
        getPrenomBytes() {
      java.lang.Object ref = prenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prenom = 3;</code>
     * @param value The prenom to set.
     * @return This builder for chaining.
     */
    public Builder setPrenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prenom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prenom = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrenom() {
      
      prenom_ = getDefaultInstance().getPrenom();
      onChanged();
      return this;
    }
    /**
     * <code>string prenom = 3;</code>
     * @param value The bytes for prenom to set.
     * @return This builder for chaining.
     */
    public Builder setPrenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prenom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 4;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object telephone_ = "";
    /**
     * <code>string telephone = 5;</code>
     * @return The telephone.
     */
    public java.lang.String getTelephone() {
      java.lang.Object ref = telephone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        telephone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string telephone = 5;</code>
     * @return The bytes for telephone.
     */
    public com.google.protobuf.ByteString
        getTelephoneBytes() {
      java.lang.Object ref = telephone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        telephone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string telephone = 5;</code>
     * @param value The telephone to set.
     * @return This builder for chaining.
     */
    public Builder setTelephone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      telephone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string telephone = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTelephone() {
      
      telephone_ = getDefaultInstance().getTelephone();
      onChanged();
      return this;
    }
    /**
     * <code>string telephone = 5;</code>
     * @param value The bytes for telephone to set.
     * @return This builder for chaining.
     */
    public Builder setTelephoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      telephone_ = value;
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


    // @@protoc_insertion_point(builder_scope:Client)
  }

  // @@protoc_insertion_point(class_scope:Client)
  private static final org.devolpex.backend.stubs.client.Client DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.devolpex.backend.stubs.client.Client();
  }

  public static org.devolpex.backend.stubs.client.Client getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Client>
      PARSER = new com.google.protobuf.AbstractParser<Client>() {
    @java.lang.Override
    public Client parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Client(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Client> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Client> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.devolpex.backend.stubs.client.Client getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

