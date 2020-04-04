# Hugo notes 


### Links
1) Hugo sites [getting started](https://gohugo.io/getting-started/quick-start)
2) Mike Dane [tutorial](https://www.youtube.com/playlist?list=PLLAZ4kZ9dFpOnyRlyS-liKL5ReHDcj4G3) on Youtube.

### Steps
1) Created a git [repo](https://github.com/HamdanKhan/blog)
2) Check out blog project locally  
```
git clone https://github.com/HamdanKhan/blog.git hamdan.blog
cd ..
hugo new site hamdan.blog --force
```
--force because we already created the blog folder from git clone. 

3) Added a theme
```
git submodule add https://github.com/cntrump/hugo-notepadium.git themes/hugo-notepadium
```
Theme is [notepadium](https://themes.gohugo.io/hugo-notepadium) copy-paste its config.toml to project toml file. 

4) Created a [disqus](disqus.com) account, also setup https://hamdan-blog.disqus.com 
5) Config hamdan-blog as disqus shortcode in config.toml file.
6) Folder summary, watch Mike Dane videos for details. 

![Folder Summary](/hugo_notes/img_files/hugo-dir.png)

7) Write the first post
```
$ hugo new posts/bootstrap.md
```
This will print  
```
.../hamdan.blog/content/posts/bootstrap.md created
```

[Mark down syntax help](
https://www.markdownguide.org/basic-syntax/)

8) Setting up nginx on Ubuntu 

```
sudo apt update
sudo apt upgrade
sudo apt install nginx
sudo ufw enable
sudo ufw allow 'Nginx HTTP'
sudo ufw allow 'Nginx HTTPS'
```

Server config From [Digitalocean's nginx tutorial](https://www.digitalocean.com/community/tutorials/how-to-install-nginx-on-ubuntu-18-04)

SSL Config from [Digitalocean's ssl tutorial](
https://www.digitalocean.com/community/tutorials/how-to-install-an-ssl-certificate-from-a-commercial-certificate-authority#generate-a-csr-and-private-key), 
[comodosslstore](https://comodosslstore.com/blog/installing-comodo-positivessl-certificate-on-nginx.html), and [nginx](http://nginx.org/en/docs/http/configuring_https_servers.html)

SSL is a bit tricky part, 
1) Generate the keys as per domain 
2) Give them to certficate provider 
3) They will email you back some keys which need to configured. 

Redirect config from http to https from [this link](
https://www.digitalocean.com/community/questions/configure-nginx-ssl-force-http-to-redirect-to-https-force-www-to-non-www-on-serverpilot-free-plan-using-nginx-configuration-file-only)

Visit [the blog](https://hamdan.blog) here you are here.
