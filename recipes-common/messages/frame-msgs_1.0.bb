inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Frame messages definition"
AUTHOR = "Terletskyi Dmytro <dmytro_terletskyi@epam.com>"
ROS_AUTHOR = "Terletskyi Dmytro"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

ROS_CN = "frame_msgs"
ROS_BPN = "frame_msgs"

ROS_BUILD_DEPENDS = " \
   std-msgs \
   rosidl-default-generators \
   rosidl-typesupport-c \
   rosidl-typesupport-cpp \
"


ROS_BUILDTOOL_DEPENDS = " \
   ament-cmake-native \
   rosidl-parser-native \
   rosidl-adapter-native \
   rosidl-generator-cpp-native \
   rosidl-generator-py-native \
   rosidl-typesupport-cpp-native \
   rosidl-typesupport-fastrtps-cpp-native \
   rosidl-typesupport-fastrtps-c-native \
   python3-numpy-native \
   python3-lark-parser-native \
"


ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
   std-msgs \
   rosidl-default-runtime \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"


# FILESEXTRAPATHS_prepend := "${THISDIR}:"
# SRC_URI = "file://CMakeLists.txt \
#            file://package.xml \
#            file://msg/FrameMessage.msg \
#            "
# S = "${WORKDIR}"

ROS_BRANCH ?= "branch=messages/frame_msgs"
SRC_URI = "git://github.com/dterletskiy/ros-examples;${ROS_BRANCH};protocol=https"
SRCREV = "de947e1b6cd780df57e192886c4e9131b1b3e3bc"
S = "${WORKDIR}/git"



ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
