import React from "react";
import { FaHome, FaSignInAlt, FaUserAlt } from "react-icons/fa";
import { Link } from "react-router-dom";
import { useSelector } from "react-redux";

import { Nav } from "./styled";

export default function Header() {
  const botaoClicado = useSelector((state) => state.example.botaoClicado);

  return (
    <Nav>
      <Link to="/login">
        <FaUserAlt size={25} />
      </Link>
      <Link to="/">
        <FaHome size={25} />
      </Link>
      <Link to="/asdasd">
        <FaSignInAlt size={25} />
      </Link>
      {botaoClicado ? "Clicado" : "Não clicado"}
    </Nav>
  );
}
