# Copyright (C) 2017, Digi International Inc.

SUMMARY = "AWS IoT Greengrass core"
HOMEPAGE = "https://aws.amazon.com/greengrass/"
#
# The package includes different licenses:
#
# [Apache-2.0]
#   LICENSE/attributions/github_aws_aws_sdk_go_License.txt
#   LICENSE/attributions/github_coreos_go_systemd_License.txt
#   LICENSE/attributions/github_docker_docker_License.txt
#   LICENSE/attributions/github_docker_go_units_License.txt
#   LICENSE/attributions/github_go_ini_ini_License.txt
#   LICENSE/attributions/github_jmespath_go_jmespath_License.txt
#   LICENSE/attributions/github_opencontainers_runc_License.txt
#   LICENSE/attributions/github_opencontainers_runtime_spec_License.txt
#   LICENSE/attributions/github_pquerna_ffjson_License.txt
#   LICENSE/attributions/github_vishvananda_netlink_License.txt
# [BSD-2-Clause]
#   LICENSE/attributions/github_godbus_dbus_License.txt
#   LICENSE/attributions/github_huin_gobinarytest_License.txt
#   LICENSE/attributions/github_seccomp_libseccomp_golang_License.txt
#   LICENSE/attributions/github_syndtr_gocapability_License.txt
# [BSD-3-Clause]
#   LICENSE/attributions/github_golang_protobuf_License.txt
#   LICENSE/attributions/github_jeffallen_mqtt_License.txt
#   LICENSE/attributions/Golang_License.txt
# [MIT]
#   LICENSE/attributions/github_huin_mqtt_License.txt
#   LICENSE/attributions/github_mattn_go_sqlite3_License.txt
#   LICENSE/attributions/github_nu7hatch_gouuid_License.txt
#   LICENSE/attributions/github_Sirupsen_logrus_License.txt
#   LICENSE/attributions/github_urfave_cli_License.txt
#   LICENSE/attributions/github_yosssi_gmq_License.txt
# [PD]
#   LICENSE/attributions/sqlite_org_License.txt
# [Proprietary]
#   LICENSE/Greengrass AWS SW License (IoT additiona) vr6.txt
#
LICENSE = "Apache-2.0 | BSD-2-Clause | BSD-3-Clause | MIT | PD | Proprietary"
LIC_FILES_CHKSUM = " \
    file://LICENSE/attributions/github_aws_aws_sdk_go_License.txt;md5=d273d63619c9aeaf15cdaf76422c4f87 \
    file://LICENSE/attributions/github_coreos_go_systemd_License.txt;md5=715f3348ed8b9bf4fac3b08133384a4d \
    file://LICENSE/attributions/github_docker_docker_License.txt;md5=bba4ee48af378e39b452d742d29c710b \
    file://LICENSE/attributions/github_docker_go_units_License.txt;md5=bb99db20f1c48c2c4952c27c72855e36 \
    file://LICENSE/attributions/github_godbus_dbus_License.txt;md5=b03a62440372a9acf9692ad365932c87 \
    file://LICENSE/attributions/github_go_ini_ini_License.txt;md5=715f3348ed8b9bf4fac3b08133384a4d \
    file://LICENSE/attributions/github_golang_protobuf_License.txt;md5=16fe162f7848190010b6ec7bfaac030a \
    file://LICENSE/attributions/github_huin_gobinarytest_License.txt;md5=f2b3138d9d314bccf5297dea7e3e6d14 \
    file://LICENSE/attributions/github_huin_mqtt_License.txt;md5=12fd125064676697934b7d8c09bed0e8 \
    file://LICENSE/attributions/github_jeffallen_mqtt_License.txt;md5=b7269d52765d477e10f319c19d8a9d33 \
    file://LICENSE/attributions/github_jmespath_go_jmespath_License.txt;md5=640d33f0070c9dc3a194d2ed7db02974 \
    file://LICENSE/attributions/github_mattn_go_sqlite3_License.txt;md5=948f36a2300ac729e60416063190f664 \
    file://LICENSE/attributions/github_nu7hatch_gouuid_License.txt;md5=6b18748dcc29fda05fa5aaef44d517fd \
    file://LICENSE/attributions/github_opencontainers_runc_License.txt;md5=587c01b2dcc5dc3b4bed51b918c64731 \
    file://LICENSE/attributions/github_opencontainers_runtime_spec_License.txt;md5=ef95ed297310c3d09ba16c06d5e161a5 \
    file://LICENSE/attributions/github_pquerna_ffjson_License.txt;md5=d273d63619c9aeaf15cdaf76422c4f87 \
    file://LICENSE/attributions/github_seccomp_libseccomp_golang_License.txt;md5=9205c4c469bfb9d3a63f346539ee445b \
    file://LICENSE/attributions/github_Sirupsen_logrus_License.txt;md5=29baae91637760ae68feb57ca93e5a0a \
    file://LICENSE/attributions/github_syndtr_gocapability_License.txt;md5=321f58fa53a0b1bb9a887f14660d436b \
    file://LICENSE/attributions/github_urfave_cli_License.txt;md5=f1f14a2449300559aed90bedc36a71ed \
    file://LICENSE/attributions/github_vishvananda_netlink_License.txt;md5=c95fd0efd62139c155e956a448df8fd6 \
    file://LICENSE/attributions/github_yosssi_gmq_License.txt;md5=2509f45544da1ecce869ce2de1aa44dd \
    file://LICENSE/attributions/Golang_License.txt;md5=3d7ed06383c65a3161b36c6a0b0b98f5 \
    file://LICENSE/attributions/sqlite_org_License.txt;md5=380e2694a297aa32879ca2ae9c6c029b \
"

# Bitbake does not support spaces in filenames, but GG License does have spaces,
# so workaround the problem by renaming the file before using it.
GG_LIC_FILENAME = "Greengrass AWS SW License (IoT additiona) vr6.txt"
GG_LIC_FILENAME_NOSPACES = "${@d.getVar('GG_LIC_FILENAME', True).replace(' ','_')}"
LIC_FILES_CHKSUM += "file://LICENSE/${GG_LIC_FILENAME_NOSPACES};md5=7df5bf535d02b2f83c260250fe330b6c"

SRC_URI = " \
    http:///not/exist/greengrass-linux-armv7l-${PV}.tar.gz \
    file://greengrass-init \
    file://0001-greengrassd-remove-bashisms-in-launcher-shell-script.patch \
"
SRC_URI[md5sum] = "893cf23f3e645d6cfe6975ea55b8b458"
SRC_URI[sha256sum] = "aa71facd21e515f6e98d4aaec873bb9bf9490552df3466ed57c0aef5cc8bef4a"

GG_TARBALL_LOCAL_PATH ?= ""

# The tarball is only available for downloading after registration, so provide
# a PREMIRROR to a local directory that can be configured in the project's
# local.conf file using GG_TARBALL_LOCAL_PATH variable.
python() {
    gg_tarball_local_path = d.getVar('GG_TARBALL_LOCAL_PATH', True)
    if gg_tarball_local_path:
        premirrors = d.getVar('PREMIRRORS', True)
        d.setVar('PREMIRRORS', "http:///not/exist/greengrass.* file://%s \\n %s" % (gg_tarball_local_path, premirrors))
}

S = "${WORKDIR}/${BPN}"

inherit aws-iot update-rc.d useradd

GG_USESYSTEMD = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'yes', 'no', d)}"

# Rename GG license file
do_unpack[postfuncs] += "rename_license"
rename_license() {
	cd ${S}/LICENSE
	mv "${GG_LIC_FILENAME}" "${GG_LIC_FILENAME_NOSPACES}"
}

# Disable tasks not needed for the binary package
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}/${BPN}
	tar --no-same-owner --exclude='./patches' --exclude='./.pc' -cpf - -C ${S} . \
		| tar --no-same-owner -xpf - -C ${D}/${BPN}

	# Install wrapper bootscript to launch Greengrass core on boot
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/greengrass-init ${D}${sysconfdir}/init.d/greengrass
	sed -i -e "s,##GG_INSTALL_DIR##,/${BPN},g" ${D}${sysconfdir}/init.d/greengrass

	# If certificates do exist, install them and update the config file
	if [ -f "${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_ROOT_CA}" ] && \
	   [ -f "${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_CERTIFICATE}" ] && \
	   [ -f "${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_PRIVATE_KEY}" ]; then
		install -m 0644 "${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_ROOT_CA}" \
			"${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_CERTIFICATE}" \
			"${AWS_IOT_CERTS_DIR}/${AWS_GGCORE_PRIVATE_KEY}" \
			${D}/${BPN}/configuration/certs/
		sed -i  -e "s,\[ROOT_CA_PEM_HERE],${AWS_GGCORE_ROOT_CA},g" \
			-e "s,\[CLOUD_PEM_CRT_HERE],${AWS_GGCORE_CERTIFICATE},g" \
			-e "s,\[CLOUD_PEM_KEY_HERE],${AWS_GGCORE_PRIVATE_KEY},g" \
			${D}/${BPN}/configuration/config.json
	fi

	# Configure the rest of GG Core parameters
	[ -n "${AWS_GGCORE_THING_ARN}" ] && sed -i -e "s,\[THING_ARN_HERE],${AWS_GGCORE_THING_ARN},g" ${D}/${BPN}/configuration/config.json
	if [ -n "${AWS_GGCORE_IOT_HOST}" ]; then
		AWS_GGCORE_HOST_PREFIX="$(echo ${AWS_GGCORE_IOT_HOST} | sed -e 's,\([^.]\+\)\.iot.*,\1,g')"
		AWS_GGCORE_REGION="$(echo ${AWS_GGCORE_IOT_HOST} | sed -e 's,.*.iot\.\([^.]\+\)\..*,\1,g')"
		[ -n "${AWS_GGCORE_HOST_PREFIX}" ] && sed -i -e "s,\[HOST_PREFIX_HERE],${AWS_GGCORE_HOST_PREFIX},g" ${D}/${BPN}/configuration/config.json
		[ -n "${AWS_GGCORE_REGION}" ] && sed -i -e "s,\[AWS_REGION_HERE],${AWS_GGCORE_REGION},g" ${D}/${BPN}/configuration/config.json
	fi

	# Configure whether to use systemd or not
	sed -i -e "/useSystemd/{s,\[yes|no],${GG_USESYSTEMD},g}" ${D}/${BPN}/configuration/config.json
}

pkg_postinst_${PN}() {
	# Enable protection for hardlinks and symlinks
	if ! grep -qs 'protected_.*links' $D${sysconfdir}/sysctl.conf; then
		cat >> $D${sysconfdir}/sysctl.conf <<-_EOF_
			# Greengrass: protect hardlinks/symlinks
			fs.protected_hardlinks = 1
			fs.protected_symlinks = 1
		_EOF_
	fi

	# Customize '/etc/fstab'
	if [ -f "$D${sysconfdir}/fstab" ]; then
		# Disable TMPFS /var/volatile
		sed -i -e '\#^tmpfs[[:blank:]]\+/var/volatile#s,^,#,g' $D${sysconfdir}/fstab

		# Mount a cgroup hierarchy with all available subsystems
		if ! grep -qs '^cgroup' $D${sysconfdir}/fstab; then
			cat >> $D${sysconfdir}/fstab <<-_EOF_
				# Greengrass: mount cgroups
				cgroup    /sys/fs/cgroup    cgroup    defaults    0  0
			_EOF_
		fi
	fi

	# Disable '/etc/resolv.conf' symlink
	if [ -f "$D${sysconfdir}/default/volatiles/00_core" ]; then
		sed -i -e '/resolv.conf/d' $D${sysconfdir}/default/volatiles/00_core
		cat >> $D${sysconfdir}/default/volatiles/00_core <<-_EOF_
			# Greengrass: create a real (no symlink) resolv.conf
			f root root 0644 /etc/resolv.conf none
		_EOF_
	fi
}

FILES_${PN} = "/${BPN} ${sysconfdir}"

CONFFILES_${PN} += "/${BPN}/configuration/config.json"

INITSCRIPT_NAME = "greengrass"
INITSCRIPT_PARAMS = "defaults 80 20"

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "-r ggc_group"
USERADD_PARAM_${PN} = "-r -M -N -g ggc_group -s /bin/false ggc_user"

#
# Disable failing QA checks:
#
#   Binary was already stripped
#   No GNU_HASH in the elf binary
#
INSANE_SKIP_${PN} += "already-stripped ldflags"

RDEPENDS_${PN} += "ca-certificates python-argparse python-json python-numbers sqlite3"
