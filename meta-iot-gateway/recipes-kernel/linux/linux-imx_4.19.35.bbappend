# Copyright (C) 2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append = " file://0001-Add-kernel-config-for-multicast.patch"

#addtask copy_defconfig_after_patch after do_patch before do_configure
#do_copy_defconfig_after_patch () {
#    # copy latest imx_v7_defconfig to use
#    cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
#    cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
#}
