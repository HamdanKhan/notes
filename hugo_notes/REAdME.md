# Hugo notes 


### Links
1) Hugo sites [getting started](https://gohugo.io/getting-started/quick-start)
2) Mike Dane [tutorial](https://www.youtube.com/playlist?list=PLLAZ4kZ9dFpOnyRlyS-liKL5ReHDcj4G3) on Youtube.

### Steps
1) Created a git [repo](https://github.com/HamdanKhan/blog)
2) Check out blog project localy  
```
git clone https://github.com/HamdanKhan/blog.git hamdan.blog
cd ..
hugo new site hamdan.blog --force
```
--force because we already created blog folder from git clone. 

3) Added a theme
```
git submodule add https://github.com/cntrump/hugo-notepadium.git themes/hugo-notepadium
```
Theme is [notepadium](https://themes.gohugo.io/hugo-notepadium) copy-paste its config.toml to project toml file. 

4) Created a [disqus](disqus.com) account, also setup https://hamdan-blog.disqus.com 
5) Config hamdan-blog as disqus shortcode in config.toml file.
6) Folder summary, watch Mike Dane videos for details. 

[Folder Summary](/notes/hugo_notes/hugo-dir.png)

7) Write first post
```
$ hugo new posts/hello-again.md
```
This will print  
```
.../hamdan.blog/content/posts/hello-again.md created
```

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
https://www.digitalocean.com/community/tutorials/how-to-install-an-ssl-certificate-from-a-commercial-certificate-authority#generate-a-csr-and-private-key)

SSL config from [comodosslstore](https://comodosslstore.com/blog/installing-comodo-positivessl-certificate-on-nginx.html)

[Mark down syntax help](
https://www.markdownguide.org/basic-syntax/)

http://nginx.org/en/docs/http/configuring_https_servers.html

https redirect
https://www.digitalocean.com/community/questions/configure-nginx-ssl-force-http-to-redirect-to-https-force-www-to-non-www-on-serverpilot-free-plan-using-nginx-configuration-file-only
