SUMMARY = "Applications necessary for AWS GreenGrass"

inherit packagegroup

RDEPENDS_${PN} = " \
    greengrass \
    libseccomp \
    openssl \
    python-boto \
    python-boto3 \
"
