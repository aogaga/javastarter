# Stage 1: Build the Angular application
FROM node:lts-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli
RUN npm install 
COPY . .
RUN npm run build

# Stage 2: Serve the application with Nginx
FROM nginx:alpine
# Copy the built files from the 'build' stage to the Nginx serving directory
COPY --from=build /app/dist/webApp/browser /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
