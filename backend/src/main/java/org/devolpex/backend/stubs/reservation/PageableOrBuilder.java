// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package org.devolpex.backend.stubs.reservation;

public interface PageableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Pageable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pageNumber = 1;</code>
   * @return The pageNumber.
   */
  int getPageNumber();

  /**
   * <code>int32 pageSize = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  long getOffset();

  /**
   * <code>bool paged = 4;</code>
   * @return The paged.
   */
  boolean getPaged();

  /**
   * <code>bool unpaged = 5;</code>
   * @return The unpaged.
   */
  boolean getUnpaged();

  /**
   * <code>.Sort sort = 6;</code>
   * @return Whether the sort field is set.
   */
  boolean hasSort();
  /**
   * <code>.Sort sort = 6;</code>
   * @return The sort.
   */
  org.devolpex.backend.stubs.reservation.Sort getSort();
  /**
   * <code>.Sort sort = 6;</code>
   */
  org.devolpex.backend.stubs.reservation.SortOrBuilder getSortOrBuilder();
}