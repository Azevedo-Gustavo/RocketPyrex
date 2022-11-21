import S from "./styles.module.scss";

import { useState } from "react";
import { IconContext } from "react-icons/lib";
import { AiOutlineBank, AiOutlineMenu, AiOutlineUser } from "react-icons/ai";
import { MdAttachMoney, MdMoneyOff } from "react-icons/md";
import { BsCashCoin } from "react-icons/bs";

import Drawer from "../../atoms/Drawer";

import { footer } from "../../../utils/footer";
import { Dropdown } from "react-bootstrap";
import { Link } from "react-router-dom";
import Button from "../../atoms/Button";

const Footer = () => {
  const [open, setOpen] = useState(false);
  const [template, setTemplate] = useState();

  const isOpen = (type) => {
    setTemplate(footer[type]);
    setOpen(true);
  };

  return (
    <IconContext.Provider value={{ color: "var(--white)", size: "30px" }}>
      <div className={S.actions}>
        <Dropdown>
          <Dropdown.Toggle className={S.toggle}>
            <div className={S.icon}>
              <AiOutlineMenu />
              Menu
            </div>
          </Dropdown.Toggle>

          <Dropdown.Menu className={S.menu}>
            <Dropdown.Item>Menu</Dropdown.Item>
            <Dropdown.Divider />
            <Dropdown.Item>Perfil</Dropdown.Item>
            <Dropdown.Item>Alterar Senha</Dropdown.Item>
            <Dropdown.Item>Editar Dados</Dropdown.Item>
            <Dropdown.Item>Configuração</Dropdown.Item>
            <Dropdown.Divider />

            <Dropdown.Item>
              <Link to="/">Sair</Link>
            </Dropdown.Item>
          </Dropdown.Menu>
        </Dropdown>

        <div className={S.icon} onClick={() => isOpen("receitas")}>
          <MdAttachMoney />
          Receitas
        </div>
        <div className={S.icon} onClick={() => isOpen("despesas")}>
          <MdMoneyOff />
          Despesas
        </div>
        <div className={S.icon} onClick={() => isOpen("bancos")}>
          <AiOutlineBank />
          Bancos
        </div>
        <div className={S.icon}>
          <BsCashCoin />
          Poupado
        </div>
      </div>

      <Drawer open={open} close={() => setOpen(false)} title={template?.title}>
        {template?.children}
      </Drawer>
    </IconContext.Provider>
  );
};

export default Footer;
