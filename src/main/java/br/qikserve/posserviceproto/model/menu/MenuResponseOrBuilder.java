// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu.proto

package br.qikserve.posserviceproto.model.menu;

public interface MenuResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MenuResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .PosEntityLink root = 1;</code>
   */
  java.util.List<br.qikserve.posserviceproto.model.menu.PosEntityLink> 
      getRootList();
  /**
   * <code>repeated .PosEntityLink root = 1;</code>
   */
  br.qikserve.posserviceproto.model.menu.PosEntityLink getRoot(int index);
  /**
   * <code>repeated .PosEntityLink root = 1;</code>
   */
  int getRootCount();
  /**
   * <code>repeated .PosEntityLink root = 1;</code>
   */
  java.util.List<? extends br.qikserve.posserviceproto.model.menu.PosEntityLinkOrBuilder> 
      getRootOrBuilderList();
  /**
   * <code>repeated .PosEntityLink root = 1;</code>
   */
  br.qikserve.posserviceproto.model.menu.PosEntityLinkOrBuilder getRootOrBuilder(
      int index);

  /**
   * <code>repeated .PosEntity entities = 2;</code>
   */
  java.util.List<br.qikserve.posserviceproto.model.menu.PosEntity> 
      getEntitiesList();
  /**
   * <code>repeated .PosEntity entities = 2;</code>
   */
  br.qikserve.posserviceproto.model.menu.PosEntity getEntities(int index);
  /**
   * <code>repeated .PosEntity entities = 2;</code>
   */
  int getEntitiesCount();
  /**
   * <code>repeated .PosEntity entities = 2;</code>
   */
  java.util.List<? extends br.qikserve.posserviceproto.model.menu.PosEntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <code>repeated .PosEntity entities = 2;</code>
   */
  br.qikserve.posserviceproto.model.menu.PosEntityOrBuilder getEntitiesOrBuilder(
      int index);
}
