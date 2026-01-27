import React from "react";
import PropTypes from "prop-types";
import { Navigate } from "react-router-dom";

export default function MyRoute({ children, isClosed }) {
  const isLoggedIn = false;

  if (isClosed && !isLoggedIn) {
    return <Navigate to="/login" replace />;
  }

  return children;
}

MyRoute.defaultProps = {
  isClosed: false,
};

MyRoute.propTypes = {
  children: PropTypes.node.isRequired,
  isClosed: PropTypes.bool,
};
