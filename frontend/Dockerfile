
FROM nginx:stable-alpine
RUN rm -rf /usr/share/nginx/html/* /etc/nginx/conf.d/default.conf
COPY ./dist/frontend /usr/share/nginx/html
COPY ./default.conf /etc/nginx/conf.d/default.conf
CMD ["/bin/sh",  "-c",  "envsubst < /usr/share/nginx/html/assets/config.teml.json > /usr/share/nginx/html/assets/config.json && exec nginx -g 'daemon off;'"]
