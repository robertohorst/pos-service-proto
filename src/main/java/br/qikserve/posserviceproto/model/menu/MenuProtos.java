// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu.proto

package br.qikserve.posserviceproto.model.menu;

public final class MenuProtos {
  private MenuProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MenuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MenuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PosEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PosEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PosEntityLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PosEntityLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmenu.proto\"J\n\014MenuResponse\022\034\n\004root\030\001 \003" +
      "(\0132\016.PosEntityLink\022\034\n\010entities\030\002 \003(\0132\n.P" +
      "osEntity\"\370\001\n\tPosEntity\022\034\n\004type\030\001 \001(\0162\016.P" +
      "osEntityType\022\n\n\002id\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023" +
      "\n\013description\030\004 \001(\t\022\r\n\005price\030\005 \001(\001\022\021\n\tav" +
      "ailable\030\006 \001(\010\022\r\n\005image\030\007 \001(\t\022\016\n\006factor\030\010" +
      " \001(\001\022\013\n\003plu\030\t \001(\t\022\017\n\007alcohol\030\n \001(\010\022 \n\tal" +
      "lergens\030\013 \003(\0162\r.AllergenType\022\035\n\005links\030\014 " +
      "\003(\0132\016.PosEntityLink\"9\n\rPosEntityLink\022\n\n\002" +
      "id\030\001 \001(\t\022\034\n\004type\030\002 \001(\0162\016.PosEntityType*\210" +
      "\001\n\rPosEntityType\022\010\n\004ITEM\020\000\022\014\n\010CATEGORY\020\001" +
      "\022\r\n\tMODIFIERS\020\002\022\017\n\013INGREDIENTS\020\003\022\017\n\013CROS" +
      "S_SELLS\020\004\022\016\n\nCOMBO_MEAL\020\005\022\016\n\nCOMBO_ITEM\020" +
      "\006\022\016\n\nSIZED_ITEM\020\007*\376\001\n\014AllergenType\022\n\n\006CE" +
      "LERY\020\000\022\n\n\006GLUTEN\020\001\022\021\n\rGRAINS_GLUTEN\020\002\022\017\n" +
      "\013CRUSTACEANS\020\003\022\010\n\004EGGS\020\004\022\010\n\004FISH\020\005\022\t\n\005LU" +
      "PIN\020\006\022\010\n\004MILK\020\007\022\014\n\010MOLLUSCS\020\010\022\013\n\007MUSTARD" +
      "\020\t\022\010\n\004NUTS\020\n\022\013\n\007PEANUTS\020\013\022\r\n\tSHELLFISH\020\014" +
      "\022\010\n\004SOYA\020\r\022\013\n\007SULPHUR\020\016\022\n\n\006SESAME\020\017\022\r\n\tS" +
      "ULPHITES\020\020\022\013\n\007CEREALS\020\021\022\t\n\005DAIRY\020\022B6\n&br" +
      ".qikserve.posserviceproto.model.menuB\nMe" +
      "nuProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MenuResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MenuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MenuResponse_descriptor,
        new java.lang.String[] { "Root", "Entities", });
    internal_static_PosEntity_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PosEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PosEntity_descriptor,
        new java.lang.String[] { "Type", "Id", "Name", "Description", "Price", "Available", "Image", "Factor", "Plu", "Alcohol", "Allergens", "Links", });
    internal_static_PosEntityLink_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_PosEntityLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PosEntityLink_descriptor,
        new java.lang.String[] { "Id", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
