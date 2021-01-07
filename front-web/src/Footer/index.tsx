import './styles.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as LinkedinIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';

function Footer(){
    return(
        <footer className ="main-footer">
           App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className ="footer-icons">
                <a href="https://www.yotube.com" target="_new"></a>
                    <YoutubeIcon/>
                <a href="https://www.linkedin.com"></a>
                    <LinkedinIcon/>
                <a href="https://www.instagram.com"></a>
                    <InstagramIcon/>
            </div>
        </footer>
    )
}
export default Footer;