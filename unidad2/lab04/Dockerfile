FROM eclipse-temurin:17-jdk

RUN apt-get update && \
    apt-get install -y \
        vim \
        iproute2 \
        net-tools \
        iputils-ping \
        traceroute \
        mtr-tiny \
    && rm -rf /var/lib/apt/lists/*

CMD ["tail", "-f", "/dev/null"]
